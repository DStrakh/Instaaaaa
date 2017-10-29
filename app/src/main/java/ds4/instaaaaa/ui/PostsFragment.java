package ds4.instaaaaa.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ds4.instaaaaa.R;
import ds4.instaaaaa.api.PostLoader;
import ds4.instaaaaa.api.models.ItemsApiModel;
import ds4.instaaaaa.api.models.PostApiModel;
import ds4.instaaaaa.widgets.footerview.FooterViewModel;
import ds4.instaaaaa.widgets.postview.PostViewModel;
import ds4.instaaaaa.widgets.profileview.ProfileViewModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.ContentValues.TAG;

public class PostsFragment extends Fragment {
    private RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        recyclerView = (RecyclerView) inflater.inflate(R.layout.fragment_posts, container, false);
        return recyclerView;
        //return super.onCreateView(inflater, container, savedInstanceState);
        //inflate fragmentposts.xml
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        load();
    }

    private void load() {
        PostLoader loader = new PostLoader("ilovefantasy");
        loader.getPosts(new Callback<ItemsApiModel>() {
            @Override
            public void onResponse(Call<ItemsApiModel> call, Response<ItemsApiModel> response) {
                ItemsApiModel body = response.body();
                if (body != null) {
                    recyclerView.setAdapter(new PostsAdapter(getPostViewModel(body.getItems())));
                }
            }

            @Override
            public void onFailure(Call<ItemsApiModel> call, Throwable t) {

            }
        });
    }

    private List<PostViewModel> getPostViewModel(List<PostApiModel> postApiModelList) {
        Log.i(TAG, "getPostViewModel: in post view model");
        List<PostViewModel> postViewModelList = new ArrayList<>();
        for (int i = 0; i < postApiModelList.size(); i++){
            PostApiModel postApiModel = postApiModelList.get(i);
            Log.i(TAG, "getPostViewModel: {postApiModel.getUser().getUserName()}");
            postViewModelList.add(
                    new PostViewModel(
                            new ProfileViewModel(
                                    postApiModel.getUser().getUserName(),
                                    postApiModel.getUser().getFullName(),
                                    postApiModel.getUser().getProfilePictureUrl()
                            ),
                            postApiModel.getImages().getLowResolution().getUrl(),
                            postApiModel.getCaption().getText(),
                            new FooterViewModel(
                                    postApiModel.getLikes().getCount(),
                                    postApiModel.getCreated()
                            )
                    )
            );
        }

        return postViewModelList;
    }
}
