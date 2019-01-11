package anifatulannisa.app.cooka.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import anifatulannisa.app.cooka.R;

/**
 * Created by annisatahira on 11/01/19.
 */

public class PendahuluanAdapter extends RecyclerView.Adapter<PendahuluanAdapter.PendahuluanHolder> {


    @NonNull
    @Override
    public PendahuluanHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PendahuluanAdapter.PendahuluanHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.pendahuluan_fragment, null));

    }

    @Override
    public void onBindViewHolder(@NonNull PendahuluanHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class PendahuluanHolder extends RecyclerView.ViewHolder {

        public PendahuluanHolder(View itemView) {
            super(itemView);
        }
    }
}
