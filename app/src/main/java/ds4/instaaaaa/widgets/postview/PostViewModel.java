package ds4.instaaaaa.widgets.postview;

import ds4.instaaaaa.widgets.footerview.FooterViewModel;
import ds4.instaaaaa.widgets.profileview.ProfileViewModel;

public class PostViewModel {
    private final ProfileViewModel profileViewModel;
    private final String imageUrl;
    private final String postMessage;
    private final FooterViewModel footerViewModel;


    public PostViewModel(ProfileViewModel profileViewModel, String imageUrl, String postMessage, FooterViewModel footerViewModel) {
        this.profileViewModel = profileViewModel;
        this.imageUrl = imageUrl;
        this.postMessage = postMessage;
        this.footerViewModel = footerViewModel;
    }

    public ProfileViewModel getProfileViewModel() {
        return profileViewModel;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getPostMessage() {
        return postMessage;
    }

    public FooterViewModel getFooterViewModel() {
        return footerViewModel;
    }
}
