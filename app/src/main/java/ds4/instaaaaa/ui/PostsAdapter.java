package ds4.instaaaaa.ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import ds4.instaaaaa.R;
import ds4.instaaaaa.api.models.PostApiModel;
import ds4.instaaaaa.widgets.footerview.FooterView;
import ds4.instaaaaa.widgets.postview.PostViewModel;
import ds4.instaaaaa.widgets.profileview.ProfileView;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostViewHolder> {
    private List<PostViewModel> posts = null;

/*    public PostsAdapter(List<PostViewModel> posts) {
        this.posts = posts;
    }*/

    public PostsAdapter(List<PostViewModel> postViewModel) {
        this.posts = postViewModel;
    }

    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item_post, parent, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, int position) {
        PostViewModel post = posts.get(position);
        //holder.postView.setData(post); govno vikinut kogda poimesh!
        holder.bind(post); //?

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    //вынести в отдельный вьюкласс
    class PostViewHolder extends RecyclerView.ViewHolder {
        private ProfileView profileView;
        private FooterView footerView;
        private TextView postMessage;
        private ImageView imageView;

        public PostViewHolder(View itemView) {
            super(itemView);
            profileView = (ProfileView) itemView.findViewById(R.id.profile_view);
            footerView = (FooterView) itemView.findViewById(R.id.footer_view);
            postMessage = (TextView) itemView.findViewById(R.id.tv_post_message);
            imageView = (ImageView) itemView.findViewById(R.id.tv_post_image);
        }

        public void bind(PostViewModel model) {
            profileView.setData(model.getProfileViewModel());
            footerView.setData(model.getFooterViewModel());
            postMessage.setText(model.getPostMessage());
            Picasso.with(itemView.getContext()).load(model.getImageUrl()).into(imageView);
        }
    }
}
