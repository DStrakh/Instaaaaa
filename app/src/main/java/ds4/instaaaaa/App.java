package ds4.instaaaaa;

import android.app.Application;

import ds4.instaaaaa.api.InstagramApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class App extends Application {
    private static InstagramApi instagramApi;
    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.instagram.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        instagramApi = retrofit.create(InstagramApi.class);
    }

    public static InstagramApi getInstagramApi() {
        return instagramApi;
    }

}
