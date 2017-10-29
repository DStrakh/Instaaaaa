package ds4.instaaaaa.ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ds4.instaaaaa.R;
import ds4.instaaaaa.api.models.PostApiModel;
import ds4.instaaaaa.widgets.postview.PostView;
import ds4.instaaaaa.widgets.postview.PostModel;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostViewHolder>{
    private List<PostModel> posts = null;

/*    public PostsAdapter(List<PostModel> posts) {
        this.posts = posts;
    }*/

    public PostsAdapter(List<PostApiModel> postApiModels) {
        if (postApiModels == null || postApiModels.size() == 0)
            return;
        posts = new ArrayList<>();
        for(int i = 0; i < postApiModels.size(); i++){
            PostApiModel postApiItem  = postApiModels.get(i);
            this.posts.add(
                    new PostModel(
                            postApiItem.getUser().getUserName()
                            ,postApiItem.getImages().getLowResolution().getUrl()
                            ,postApiItem.getCreated()
                            ,postApiItem.getCaption().getText()
                    )
            );
        }
//String imageUrl, String date, String postMessage

    }

    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item_post, parent, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, int position) {
        PostModel post = posts.get(position);
        //holder.postView.setData(post); govno
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

        public void bind(PostModel model){
            postView.setData(model);
        }
    }
}
