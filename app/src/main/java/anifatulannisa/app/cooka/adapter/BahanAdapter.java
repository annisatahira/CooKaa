package anifatulannisa.app.cooka.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import anifatulannisa.app.cooka.R;
import anifatulannisa.app.cooka.model.Bahan;

/**
 * Created by annisatahira on 11/01/19.
 */

public class BahanAdapter extends RecyclerView.Adapter<BahanAdapter.BahanHolder> {

    Context context;
    private List<Bahan> lstBahan;

    public BahanAdapter(Context context, List<Bahan> lstBahan) {
        this.context=context;
        this.lstBahan= lstBahan;
    }

    @NonNull
    @Override
    public BahanHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BahanHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bahan, null));
    }

    @Override
    public void onBindViewHolder(@NonNull BahanHolder holder, final int position) {
        holder.txtBahan.setText(lstBahan.get(position).getStep());
    }

    @Override
    public int getItemCount() {
        return lstBahan.size();
    }

    public static class BahanHolder extends RecyclerView.ViewHolder {
        public TextView txtBahan;

        public BahanHolder(View itemView) {
            super(itemView);
            txtBahan = itemView.findViewById(R.id.txt_bahan);
        }
    }

}
