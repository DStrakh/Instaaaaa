package ds4.instaaaaa.api;

import android.widget.Toast;

import java.util.List;
import java.util.Objects;

import ds4.instaaaaa.App;
import ds4.instaaaaa.MainActivity;
import ds4.instaaaaa.api.models.ItemsApiModel;
import ds4.instaaaaa.api.models.LikeApiModel;
import ds4.instaaaaa.api.models.PostApiModel;
import ds4.instaaaaa.widgets.postview.PostViewModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostLoader {
    private String nickName = "ilovefantasy";
    public PostLoader(String nickName) {
        this.nickName = nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public List<PostApiModel> GetPosts(){
        InstagramApi api =  App.getInstagramApi();
        final List<PostApiModel> postsApi = null;
        final ItemsApiModel[] responseApi = new ItemsApiModel[1];
        api.getData(nickName).enqueue(
                new Callback<ItemsApiModel>() {
                    @Override
                    public void onResponse(Call<ItemsApiModel> call, Response<ItemsApiModel> response) {
                        responseApi[0] = response.body();

                        //recyclerView.getAdapter().notifyDataSetChanged();
                    }

                    @Override
                    public void onFailure(Call<ItemsApiModel> call, Throwable t) {
                        //Toast.makeText(MainActivity.this, "An error occurred during networking", Toast.LENGTH_SHORT).show();
                    }
                });
        return  postsApi;
    }
}


