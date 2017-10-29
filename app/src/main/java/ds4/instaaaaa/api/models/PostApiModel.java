package ds4.instaaaaa.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.security.Timestamp;
import java.util.List;

public class PostApiModel {
    @SerializedName("id")
    String id;
    @SerializedName("code")
    String code;
    @SerializedName("user")
    ProfileApiModel user;

    @SerializedName("images")
    ImagesApiModel images;

    @SerializedName("carousel_media")
    List<ImageApiModel> carouselMedia;
    @SerializedName("created_time")
    String created;
    @SerializedName("caption")
    CaptionApiModel caption;
    @SerializedName("likes")
    LikeApiModel likes;
   /* @SerializedName("comments")
    List<CommentApiModel> comments;*/
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
    /*@SerializedName("location")
    String location;*/

    public String getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public ProfileApiModel getUser() {
        return user;
    }

    public ImagesApiModel getImages() {
        return images;
    }

    public List<ImageApiModel> getCarouselMedia() {
        return carouselMedia;
    }

    public String getCreated() {
        return created;
    }

    public CaptionApiModel getCaption() {
        return caption;
    }

    public LikeApiModel getLikes() {
        return likes;
    }

    /*public List<CommentApiModel> getComments() {
        return comments;
    }
    */
    public List<UserOnPhotoApiModel> getUsersOnPhoto() {
        return usersOnPhoto;
    }

    public boolean isCanViewComments() {
        return canViewComments;
    }

    public boolean isCanDeleteComments() {
        return canDeleteComments;
    }

    public String getType() {
        return type;
    }

    public String getLink() {
        return link;
    }

    /*public String getLocation() {
        return location;
    }*/
}
