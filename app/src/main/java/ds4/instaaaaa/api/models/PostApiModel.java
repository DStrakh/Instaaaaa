package ds4.instaaaaa.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.security.Timestamp;
import java.util.List;

public class PostApiModel {
    @SerializedName("id")
    int id;
    @SerializedName("code")
    String code;
    @SerializedName("user")
    ProfileApiModel user;

    @SerializedName("images")
    ImagesApiModel images;

    @SerializedName("carousel_media")
    List<ImageApiModel> carouselMedia;
    @SerializedName("created_time")
    Timestamp created;
    @SerializedName("caption")
    CaptionApiModel caption;
    @SerializedName("likes")
    LikeApiModel likes;
    @SerializedName("comments")
    List<CommentApiModel> comments;
    @SerializedName("users_in_photo")
    List<UserOnPhotoApiModel> usersOnPhoto;
    @SerializedName("can_view_comments")
    boolean canViewComments;
    @SerializedName("can_delete_comments")
    boolean canDeleteComments;
    @SerializedName("type")
    String type;
    @SerializedName("link")
    String link;
    @SerializedName("carousel_media")
    String location;
}
