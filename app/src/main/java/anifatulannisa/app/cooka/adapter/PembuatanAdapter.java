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
import anifatulannisa.app.cooka.model.Pembuatan;

/**
 * Created by annisatahira on 11/01/19.
 */

public class PembuatanAdapter extends RecyclerView.Adapter<PembuatanAdapter.PembuatanHolder>{
    Context context;
    private List<Pembuatan> lstCara;

    public PembuatanAdapter(Context context, List<Pembuatan> lstCara) {
        this.context = context;
        this.lstCara = lstCara;
    }

    @NonNull
    @Override
    public PembuatanHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PembuatanAdapter.PembuatanHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pembuatan, null));
    }

    @Override
    public void onBindViewHolder(@NonNull PembuatanHolder holder, final int position) {
        Glide.with(context).load(lstCara.get(position).getImg_proses()).into(holder.ImgProses);
        holder.TxtCara.setText(lstCara.get(position).getTxt_tahap());
    }

    @Override
    public int getItemCount() {
        return lstCara.size();
    }


    public static class PembuatanHolder extends RecyclerView.ViewHolder{
        public ImageView ImgProses;
        public TextView TxtCara;

        public PembuatanHolder(View itemView) {
            super(itemView);
            ImgProses = itemView.findViewById(R.id.img_proses);
            TxtCara = itemView.findViewById(R.id.txt_cara);
        }


    }
}
