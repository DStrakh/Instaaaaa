package ds4.instaaaaa;

import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import ds4.instaaaaa.api.PostLoader;
import ds4.instaaaaa.api.models.ItemsApiModel;
import ds4.instaaaaa.api.models.PostApiModel;
import ds4.instaaaaa.ui.PostsAdapter;
import ds4.instaaaaa.widgets.postview.PostView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    List<PostApiModel> posts = new ArrayList<>();
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //LayoutInflater inflater = getLayoutInflater();
        //final ConstraintLayout clayout = (ConstraintLayout) findViewById(R.id.main_activity);
        //final View view1 =  inflater.inflate(R.layout.fragment_posts, clayout, true);
        //PostsAdapter adapter = new PostsAdapter(posts);*/

        recyclerView = (RecyclerView) findViewById(R.id.fragment_posts);
        /*final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);*/
       /* PostsAdapter adapter = new PostsAdapter(posts);
        recyclerView.setAdapter(adapter);*/

        PostLoader loader = new PostLoader("ilovefantasy");
        loader.getPosts(new Callback<ItemsApiModel>() {
            @Override
            public void onResponse(Call<ItemsApiModel> call, Response<ItemsApiModel> response) {
                ItemsApiModel body = response.body();
                if (body != null) {
                    posts = body.getItems();
                    recyclerView.setAdapter(new PostsAdapter(posts));
                    //recyclerView.getAdapter().notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<ItemsApiModel> call, Throwable t) {

            }
        });
//                new InstaCallback() {
//                    @Override
//                    public void getInstaPostsSuccess(ItemsApiModel body) {
//                        if (body != null){
//                            posts =  body.getItems();
//                            PostsAdapter adapter = new PostsAdapter(posts);
//                            recyclerView.setAdapter(adapter);
//                            //recyclerView.getAdapter().notifyDataSetChanged();
//                        }
//
//                    }
//
//                    @Override
//                    public void getInstaPostsFailed(String text) {
//                        //((TextView)findViewById(R.id.tv_maintext)).setText(String.valueOf(text));
//                        //Toast.makeText("ahahahahhah");
//                    }
//                });


    }
}
