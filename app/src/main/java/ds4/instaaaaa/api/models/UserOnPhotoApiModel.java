package ds4.instaaaaa.api.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by M6700 on 22.10.2017.
 */

public class UserOnPhotoApiModel {
    @SerializedName("user")
    ProfileApiModel user;
    @SerializedName("position")
    UserOnPhotoApiModel position;
}
