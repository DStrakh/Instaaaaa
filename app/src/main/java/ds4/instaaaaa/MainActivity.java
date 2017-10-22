package ds4.instaaaaa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ds4.instaaaaa.api.PostLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PostLoader loader = new PostLoader("ilovefantasy");
        loader.GetPosts();
    }
}
