package ds4.instaaaaa.widgets.postview;

public class PostModel {
    String userName;
    String imageUrl;
    String date;
    String postMessage;

    public PostModel(String userName, String imageUrl, String date, String postMessage) {
        this.userName = userName;
        this.imageUrl = imageUrl;
        this.date = date;
        this.postMessage = postMessage;
    }

    public String getUserName() {
        return userName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDate() {
        return date;
    }

    public String getPostMessage() {
        return postMessage;
    }
}
