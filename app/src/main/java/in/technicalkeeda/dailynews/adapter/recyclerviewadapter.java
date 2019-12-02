package in.technicalkeeda.dailynews.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import in.technicalkeeda.dailynews.R;

public class recyclerviewadapter extends RecyclerView.Adapter<recyclerviewadapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{

ImageView imageicon;
TextView textView;
CardView cardView;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);

    imageicon=itemView.findViewById(R.id.newsimageicon);//R.id.newsimageicon);
    textView=itemView.findViewById(R.id.newstitle);
    cardView=itemView.findViewById(R.id.parentid);
    }

}
}

