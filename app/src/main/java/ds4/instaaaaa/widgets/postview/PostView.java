package ds4.instaaaaa.widgets.postview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import ds4.instaaaaa.R;
import ds4.instaaaaa.api.models.PostApiModel;
import ds4.instaaaaa.widgets.footerview.FooterViewModel;
import ds4.instaaaaa.widgets.footerview.FooterView;
import ds4.instaaaaa.widgets.profileview.ProfileView;

public class PostView extends FrameLayout{
    FooterView footerView;
    ImageView ivPostPhoto;
    ProfileView profileView;

    public PostView(@NonNull Context context) {
        super(context);
        inflate();
    }


    public void setData(PostViewModel model) {
        //footerView.setData(new FooterViewModel(11, model.getDate()));
        //Picasso.with(getContext()).load(model.getImageUrl()).into(ivPostPhoto);

    }
    private void inflate(){
        LayoutInflater.from(getContext()).inflate(R.layout.view_item_post, this);
        //this.footerView = findViewById()
        this.ivPostPhoto = new ImageView(getContext());
        this.profileView = new ProfileView(getContext());

    }

    /*public void setData(PostApiModel post) {
        setData(new PostViewModel(
                post.getUser().getUserName()
                , post.getImages().getLowResolution().getUrl()
                , post.getCreated()
                , post.getCaption().getText()
        ));
    }*/
}
