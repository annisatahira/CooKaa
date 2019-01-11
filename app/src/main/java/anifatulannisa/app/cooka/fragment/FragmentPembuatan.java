package anifatulannisa.app.cooka.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import anifatulannisa.app.cooka.R;
import anifatulannisa.app.cooka.adapter.PembuatanAdapter;
import anifatulannisa.app.cooka.model.Pembuatan;

/**
 * Created by annisatahira on 11/01/19.
 */

public class FragmentPembuatan extends Fragment {

    View v;
    private List<Pembuatan> lstCara;
    private RecyclerView rv_cara;
    private TextView TxtCara;
    private ImageView ImgProses;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.pembuatan_fragment,container,false);
        rv_cara = (RecyclerView) v.findViewById(R.id.rv_cara);
        PembuatanAdapter recylerviewAdapter = new PembuatanAdapter(getContext(), lstCara);
        rv_cara.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv_cara.setAdapter(recylerviewAdapter);
        return v;
    }
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstCara = new ArrayList<>();
        lstCara.add(new Pembuatan(R.drawable.tumis,"tumis cabai merah dan bawang putih hingga harum" ));
        lstCara.add(new Pembuatan(R.drawable.tambah_udang,"setelah harum masukkan udang" ));
        lstCara.add(new Pembuatan(R.drawable.tambah_kangkung,"setelah udang berwarna kekuningan, masukkan " +
                "kangkung yang telah dicuci, tambahkan air,saus tiram, merica dan garam" ));
        lstCara.add(new Pembuatan(R.drawable.aduk_semua,"tunggu hingga layu, dan aduk," +
                "setelah empuk angkat dan tiriskan" ));
        lstCara.add(new Pembuatan(R.drawable.tumis_kangkung,"tumis kangkung siap di hidangkan" ));

    }
}
