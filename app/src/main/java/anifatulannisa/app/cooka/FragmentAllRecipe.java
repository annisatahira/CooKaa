package anifatulannisa.app.cooka;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by annisatahira on 07/01/19.
 */

public class FragmentAllRecipe extends Fragment {

    View v ;

    private RecyclerView myrecyclerView;
    private List<AllRecipe> lstRecipe ;

    public FragmentAllRecipe() {
    }

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.allrecipe_fragment,container,false);
        myrecyclerView = (RecyclerView) v.findViewById((R.id.rvAllResep));
        AllRecipeAdapter recylerviewAdapter = new AllRecipeAdapter(getContext(), lstRecipe);
        myrecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        myrecyclerView.setAdapter(recylerviewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstRecipe = new ArrayList<>();
        lstRecipe.add(new AllRecipe(R.drawable.rempah2, "Rempah-Rempah"));
        lstRecipe.add(new AllRecipe(R.drawable.ic_bahan, "Bahan Masakan"));
        lstRecipe.add(new AllRecipe(R.drawable.ic_masak, "Tips Memasak"));
        lstRecipe.add(new AllRecipe(R.drawable.rempah2, "Rempah-Rempah"));
        lstRecipe.add(new AllRecipe(R.drawable.ic_bahan, "Bahan Masakan"));
        lstRecipe.add(new AllRecipe(R.drawable.ic_masak, "Tips Memasak"));
        lstRecipe.add(new AllRecipe(R.drawable.rempah2, "Rempah-Rempah"));
        lstRecipe.add(new AllRecipe(R.drawable.ic_bahan, "Bahan Masakan"));
        lstRecipe.add(new AllRecipe(R.drawable.ic_masak, "Tips Memasak"));
    }
}
