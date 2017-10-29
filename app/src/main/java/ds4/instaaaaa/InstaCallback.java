package ds4.instaaaaa;
import ds4.instaaaaa.api.models.ItemsApiModel;

public interface InstaCallback {
    void getInstaPostsSuccess(ItemsApiModel body);
    void getInstaPostsFailed(String text);
}
