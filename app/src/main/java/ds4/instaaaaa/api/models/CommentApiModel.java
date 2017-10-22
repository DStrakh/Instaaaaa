package ds4.instaaaaa.api.models;

import com.google.gson.annotations.SerializedName;

import java.security.Timestamp;

/**
 * Created by M6700 on 21.10.2017.
 */

public class CommentApiModel {
    @SerializedName("id")
    int id;
    @SerializedName("text")
    String text;
    @SerializedName("created_time")
    Timestamp created;
    @SerializedName("from")
    ProfileApiModel author;

}
