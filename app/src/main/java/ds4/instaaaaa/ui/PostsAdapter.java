package ds4.instaaaaa.ui;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ds4.instaaaaa.widgets.postview.PostView;
import ds4.instaaaaa.widgets.postview.PostViewModel;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostViewHolder>{
    private List<PostViewModel> posts;

    public PostsAdapter(List<PostViewModel> posts) {
        this.posts = posts;
    }

    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate

        return null;
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, int position) {
        holder.bind(posts.get(position));
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    class PostViewHolder extends RecyclerView.ViewHolder{
        private PostView postView;

        public PostViewHolder(View itemView) {
            super(itemView);
        }

        public void bind(PostViewModel model){
            postView.setData(model);
        }
    }
}
