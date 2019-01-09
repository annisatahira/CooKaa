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

import anifatulannisa.app.cooka.model.AllRecipe;
import anifatulannisa.app.cooka.R;

/**
 * Created by annisatahira on 07/01/19.
 */

public class AllRecipeAdapter extends RecyclerView.Adapter<AllRecipeAdapter.AllRecipeHolder> {

    Context context;
    private List<AllRecipe> reseps;

    public AllRecipeAdapter(Context context, List<AllRecipe> reseps) {
        this.context=context;
        this.reseps=reseps;
    }

    @NonNull
    @Override
    public AllRecipeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new AllRecipeHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_all_recipe, null));
    }

    @Override
    public void onBindViewHolder(AllRecipeHolder holder, final int position) {
        Glide.with(context).load(reseps.get(position).getImgAllRecipe()).into(holder.img_all_recipe);

        holder.txt_all_recipe.setText(reseps.get(position).getNamaAllRecipe());
    }

    @Override
    public int getItemCount() {
        return reseps.size();
    }

    public static class AllRecipeHolder extends RecyclerView.ViewHolder {

        public ImageView img_all_recipe;
        public TextView txt_all_recipe;
        public View cardItemRecipe;

        public AllRecipeHolder(View itemView) {
            super(itemView);
            cardItemRecipe = itemView.findViewById(R.id.cardview_recipe);
            img_all_recipe = itemView.findViewById(R.id.img_resep_id);
            txt_all_recipe = itemView.findViewById(R.id.nama_resep_id);
        }
    }

}