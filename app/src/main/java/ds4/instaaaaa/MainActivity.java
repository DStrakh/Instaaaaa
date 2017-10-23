package ds4.instaaaaa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.Iterator;
import java.util.List;

import ds4.instaaaaa.api.PostLoader;
import ds4.instaaaaa.api.models.PostApiModel;
import ds4.instaaaaa.ui.PostsAdapter;
import ds4.instaaaaa.widgets.postview.PostViewModel;

public class MainActivity extends AppCompatActivity {

    List<PostApiModel> posts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PostLoader loader = new PostLoader("ilovefantasy");
        PostsAdapter adapter = new PostsAdapter(loader.GetPosts());


        posts = loader.GetPosts();
        int  i = 0;
        if (posts != null)
            for (int z =0; z < posts.size(); z++) {
                i++;
            }
        ((TextView)findViewById(R.id.tv_maintext)).setText(String.valueOf(i));
    }
}
