package ds4.instaaaaa.widgets.footerview;

/**
 * Created by M6700 on 21.10.2017.
 */

public class FooterModel {
    private int likes;
    private String date;

    public FooterModel(int likes, String date) {
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
