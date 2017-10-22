package ds4.instaaaaa.widgets.profileview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import ds4.instaaaaa.R;
public class ProfileView extends FrameLayout {
    private TextView tvNickname;
    private TextView tvDescription;
    private ImageView ivAvatar;

    public ProfileView(@NonNull Context context) {
        super(context);
        inflate();
    }

    public ProfileView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        inflate();
    }

    public void setData(ProfileModel model){
        tvNickname.setText(model.getNickname());
        tvDescription.setText(model.getDescription());
        // TODO: 19.10.2017 : add image size control
        Picasso.with(getContext()).load(model.getImageUrl()).into(ivAvatar);
    }

    private void inflate(){
        LayoutInflater.from(getContext()).inflate(R.layout.view_user_info_header, this);
        tvNickname = (TextView) findViewById(R.id.tv_nickname);
        tvDescription = (TextView) findViewById(R.id.tv_account_description);
        ivAvatar = (ImageView) findViewById(R.id.iv_avatar);

    }

}
