package ds4.instaaaaa.widgets.footerview;

/**
 * Created by M6700 on 21.10.2017.
 */

public class FooterViewModel {
    private int likes;
    private String date;

    public FooterViewModel(int likes, String date) {
        this.likes = likes;
        this.date = date;
    }

    public int getLikes() {
        return likes;
    }

    public String getDate() {
        return date;
    }
}
