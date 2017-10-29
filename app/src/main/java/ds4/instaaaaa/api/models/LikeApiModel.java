package ds4.instaaaaa.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LikeApiModel {

    @SerializedName("data")
    private List<ProfileApiModel> userLiked;
    @SerializedName("count")
    private int count;

    public LikeApiModel(List<ProfileApiModel> userLiked, int count) {
        this.userLiked = userLiked;
        this.count = count;
    }

    public List<ProfileApiModel> getUserLiked() {
        return userLiked;
    }

    public int getCount() {
        return count;
    }
}
