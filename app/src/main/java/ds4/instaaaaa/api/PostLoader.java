package ds4.instaaaaa.api;

import ds4.instaaaaa.App;
import ds4.instaaaaa.api.models.ItemsApiModel;
import retrofit2.Callback;

public class PostLoader {
    private String nickName = "ilovefantasy";

    public PostLoader(String nickName) {
        this.nickName = nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void getPosts(final Callback<ItemsApiModel> callback) {
        InstagramApi api = App.getInstagramApi();
        api.getData(nickName).enqueue(callback);
               /* new Callback<ItemsApiModel>() {
                    @Override
                    public void onResponse(Call<ItemsApiModel> call, Response<ItemsApiModel> response) {
                        callback.getInstaPostsSuccess(response.body());
                    }

                    @Override
                    public void onFailure(Call<ItemsApiModel> call, Throwable t) {
                        callback.getInstaPostsFailed("Это фиаско, братан!%n" + t.getMessage() + "%n%n" + t.getStackTrace().toString());
                    }
                });*/
    }
}


