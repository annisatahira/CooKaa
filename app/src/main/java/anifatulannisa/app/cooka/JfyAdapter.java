package anifatulannisa.app.cooka;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by annisatahira on 07/01/19.
 */

public class JfyAdapter extends RecyclerView.Adapter<JfyAdapter.JfyHolder> {

    Context context;
    private List<JustForYou> jfys;

    public JfyAdapter(Context context, List<JustForYou> jfys) {
        this.context=context;
        this.jfys=jfys;
    }

    @NonNull
    @Override
    public JfyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new JfyHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_jfy, null));
    }

    @Override
    public void onBindViewHolder(JfyHolder holder, final int position) {
        Glide.with(context).load(jfys.get(position).getImage()).into(holder.imgJfy);

        holder.txtJfy.setText(jfys.get(position).getJudul());
    }

    @Override
    public int getItemCount() {
        return jfys.size();
    }

    public static class JfyHolder extends RecyclerView.ViewHolder {

        public ImageView imgJfy;
        public TextView txtJfy;
        public View cardItemJfy;

        public JfyHolder(View itemView) {
            super(itemView);
            cardItemJfy = itemView.findViewById(R.id.cardview_jfy);
            imgJfy = itemView.findViewById(R.id.img_jfy);
            txtJfy = itemView.findViewById(R.id.txt_jfy);
        }
    }

}

