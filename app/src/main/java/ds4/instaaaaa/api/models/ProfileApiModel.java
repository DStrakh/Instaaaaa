package ds4.instaaaaa.api.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by M6700 on 21.10.2017.
 */

public class ProfileApiModel {
    @SerializedName("id")
    int id;
    @SerializedName("full_name")
    String fullName;
    @SerializedName("profile_picture")
    String profilePictureUrl;
    @SerializedName("username")
    String userName;
}
