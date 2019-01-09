package anifatulannisa.app.cooka.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import anifatulannisa.app.cooka.R;
import anifatulannisa.app.cooka.adapter.JfyAdapter;
import anifatulannisa.app.cooka.model.JustForYou;

/**
 * Created by annisatahira on 07/01/19.
 */

public class FragmentJfy extends Fragment {

    View v ;

    private RecyclerView myrecyclerView;
    private List<JustForYou> lstJfy ;

    public FragmentJfy() {
    }

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.jfy_fragment,container,false);
        myrecyclerView = (RecyclerView) v.findViewById((R.id.jfy_rv));
        JfyAdapter recylerviewAdapter = new JfyAdapter(getContext(), lstJfy);
        myrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerView.setAdapter(recylerviewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstJfy = new ArrayList<>();
        lstJfy.add(new JustForYou(R.drawable.rempah2, "Rempah-Rempah"));
        lstJfy.add(new JustForYou(R.drawable.ic_bahan, "Bahan Masakan"));
        lstJfy.add(new JustForYou(R.drawable.ic_masak, "Tips Memasak"));
    }
}
