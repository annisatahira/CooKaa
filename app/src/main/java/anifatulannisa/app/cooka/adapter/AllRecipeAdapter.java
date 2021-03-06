package anifatulannisa.app.cooka.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import anifatulannisa.app.cooka.DefaultActivity;
import anifatulannisa.app.cooka.DetailActivityBahan;
import anifatulannisa.app.cooka.DetailActivityRecipe;
import anifatulannisa.app.cooka.DetailActivityRempah;
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
        final AllRecipeHolder holder = new AllRecipeHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_all_recipe, null));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent;
                int position = holder.getAdapterPosition();
                switch (position){
                    case 0:
                        intent =  new Intent(context, DetailActivityRecipe.class);
                        intent.putExtra("id_img_detail_recipe", reseps.get(position).getImgAllRecipe());
                        break;
                    case 1:
                        intent =  new Intent(context, DefaultActivity.class);
                        break;
                    default:
                        intent =  new Intent(context, DefaultActivity.class);
                        break;
                }
                context.startActivity(intent);
            }
        });
        return holder;
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