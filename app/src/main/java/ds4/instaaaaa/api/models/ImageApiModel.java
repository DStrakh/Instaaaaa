package ds4.instaaaaa.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by M6700 on 21.10.2017.
 */

public class ImageApiModel {
    @SerializedName("width")
    int width;
    @SerializedName("height")
    int height;
    @SerializedName("url")
    String url;
    @SerializedName("users_in_photo")
    List<UserOnPhotoApiModel> usersOnPhoto;

    public ImageApiModel(int width, int height, String url, List<UserOnPhotoApiModel> usersOnPhoto) {
        this.width = width;
        this.height = height;
        this.url = url;
        this.usersOnPhoto = usersOnPhoto;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getUrl() {
        return url;
    }

    public List<UserOnPhotoApiModel> getUsersOnPhoto() {
        return usersOnPhoto;
    }
}
