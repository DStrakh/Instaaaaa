package ds4.instaaaaa.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LikeApiModel {

    @SerializedName("data")
    List<ProfileApiModel> userLiked;
    @SerializedName("count")
    int count;
}
