package ds4.instaaaaa.ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;
import java.util.zip.Inflater;

import ds4.instaaaaa.R;
import ds4.instaaaaa.api.models.PostApiModel;
import ds4.instaaaaa.widgets.postview.PostView;
import ds4.instaaaaa.widgets.postview.PostViewModel;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostViewHolder>{
    private List<PostViewModel> posts;

    //public PostsAdapter(List<PostViewModel> posts) {
    //    this.posts = posts;
    //}

    public PostsAdapter(List<PostApiModel> postApiModels) {
        if (postApiModels == null)
            return;
        for(int i = 0; i < postApiModels.size(); i++){
            this.posts.add(
                    new PostViewModel(
                            postApiModels.get(i)
                                    .getUser()
                                    .getUserName()));
        }


    }

    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item_post, parent, false );
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, int position) {
        PostViewModel post = posts.get(position);
        holder.postView.setData(post);
        holder.bind(post); //?

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
