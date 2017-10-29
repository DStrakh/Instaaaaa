package ds4.instaaaaa.api.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by M6700 on 21.10.2017.
 */

public class ProfileApiModel {
    @SerializedName("id")
    String id;
    @SerializedName("full_name")
    String fullName;
    @SerializedName("profile_picture")
    String profilePictureUrl;
    @SerializedName("username")
    String userName;

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public String getUserName() {
        return userName;
    }
}
