package ds4.instaaaaa.api;

import java.util.List;

import ds4.instaaaaa.api.models.ItemsApiModel;
import ds4.instaaaaa.api.models.PostApiModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface InstagramApi {
    @GET("/{nickname}/media")
    Call<ItemsApiModel> getData(@Path("nickname") String nickname);
}
