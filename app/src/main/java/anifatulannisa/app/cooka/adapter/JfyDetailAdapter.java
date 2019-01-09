package anifatulannisa.app.cooka.adapter;

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

import anifatulannisa.app.cooka.R;
import anifatulannisa.app.cooka.model.GridJfy;

/**
 * Created by annisatahira on 07/01/19.
 */

public class JfyDetailAdapter extends RecyclerView.Adapter<JfyDetailAdapter.JfyDetailHolder> {

    Context context;
    private List<GridJfy> detail_jfy;

    public JfyDetailAdapter(Context context, List<GridJfy> detail_jfy) {
        this.context=context;
        this.detail_jfy=detail_jfy;
    }

    @NonNull
    @Override
    public JfyDetailHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new JfyDetailHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_detail_jfy, null));
    }

    @Override
    public void onBindViewHolder(JfyDetailHolder holder, final int position) {
        Glide.with(context).load(detail_jfy.get(position).getImgGrid()).into(holder.img_grid);

        holder.txt_grid.setText(detail_jfy.get(position).getNamaGrid());
    }

    @Override
    public int getItemCount() {
        return detail_jfy.size();
    }

    public static class JfyDetailHolder extends RecyclerView.ViewHolder {

        public ImageView img_grid;
        public TextView txt_grid;
        public View cardItemGrid;

        public JfyDetailHolder(View itemView) {
            super(itemView);
            cardItemGrid = itemView.findViewById(R.id.cardview_detail_jfy);
            img_grid = itemView.findViewById(R.id.img_detail_jfy);
            txt_grid = itemView.findViewById(R.id.nama_detail_jfy);
        }
    }

}
