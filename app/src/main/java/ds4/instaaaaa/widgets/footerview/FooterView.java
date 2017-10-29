package ds4.instaaaaa.widgets.footerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;

import ds4.instaaaaa.R;


public class FooterView extends FrameLayout {
    TextView tvLikes;
    TextView tvDate;

    public FooterView(@NonNull Context context) {
        super(context);
        inflate();
    }

    public FooterView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        inflate();
    }

    public void setData(FooterViewModel model){

    }

    private void inflate(){
        LayoutInflater.from(getContext()).inflate(R.layout.view_footer, this);
        tvLikes = (TextView) findViewById(R.id.tv_likes);
        tvDate = (TextView) findViewById(R.id.tv_date);
    }
}
