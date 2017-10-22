package ds4.instaaaaa.widgets.profileview;

/**
 * Created by M6700 on 19.10.2017.
 */

public class ProfileModel {
    private final String nickname;
    private final String description;
    private final String imageUrl;

    public ProfileModel(String nickname, String description, String imageUrl) {
        this.nickname = nickname;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public String getNickname() {
        return nickname;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
