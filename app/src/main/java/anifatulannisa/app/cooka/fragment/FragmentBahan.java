package anifatulannisa.app.cooka.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import anifatulannisa.app.cooka.R;
import anifatulannisa.app.cooka.adapter.BahanAdapter;
import anifatulannisa.app.cooka.model.Bahan;

/**
 * Created by annisatahira on 11/01/19.
 */

public class FragmentBahan extends Fragment {

    View v;
    private List<Bahan> lstBahan;
    private RecyclerView rv_bahan_resep;
    private TextView txtBahan;

    public FragmentBahan() {

    }

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.bahan_fragment,container,false);
        rv_bahan_resep = (RecyclerView) v.findViewById(R.id.rv_bahan_resep);
        BahanAdapter recylerviewAdapter = new BahanAdapter(getContext(), lstBahan);
        rv_bahan_resep.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv_bahan_resep.setAdapter(recylerviewAdapter);
        return v;
    }
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstBahan = new ArrayList<>();
        lstBahan.add(new Bahan("300 gram kangkung" ));
        lstBahan.add(new Bahan("3 sdm minyak goreng" ));
        lstBahan.add(new Bahan("4 siung bawang putih, iris" ));
        lstBahan.add(new Bahan("8 ekor udang segar, belah punggung" ));
        lstBahan.add(new Bahan("2 sdm saus tiram" ));
        lstBahan.add(new Bahan("50 ml air" ));
        lstBahan.add(new Bahan("3 cabai merah, iris" ));
        lstBahan.add(new Bahan("garam dan merica secukupnya" ));

    }
}
