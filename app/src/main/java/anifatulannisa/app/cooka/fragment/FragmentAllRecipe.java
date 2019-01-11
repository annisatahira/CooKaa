package anifatulannisa.app.cooka.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import anifatulannisa.app.cooka.R;
import anifatulannisa.app.cooka.adapter.AllRecipeAdapter;
import anifatulannisa.app.cooka.model.AllRecipe;

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
        lstRecipe.add(new AllRecipe(R.drawable.tumis_kangkung, "Tumis Kangkung"));
        lstRecipe.add(new AllRecipe(R.drawable.mie, "Mie"));
        lstRecipe.add(new AllRecipe(R.drawable.perkedel, "Perkedel"));
        lstRecipe.add(new AllRecipe(R.drawable.sayur_asem, "sayur Asem"));
        lstRecipe.add(new AllRecipe(R.drawable.steak, "Steak"));
        lstRecipe.add(new AllRecipe(R.drawable.sup, "Sup"));

    }
}
