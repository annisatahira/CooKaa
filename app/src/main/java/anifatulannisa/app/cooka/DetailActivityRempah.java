package anifatulannisa.app.cooka;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import anifatulannisa.app.cooka.adapter.JfyDetailAdapter;
import anifatulannisa.app.cooka.model.GridJfy;

/**
 * Created by annisatahira on 09/01/19.
 */

public class DetailActivityRempah extends AppCompatActivity {

    List<GridJfy> rempahs;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_jfy);

        rempahs = new ArrayList<>();
        rempahs.add(new GridJfy(R.drawable.adas_manis, "Adas Manis"));
        rempahs.add(new GridJfy(R.drawable.asam_jawa, "Asam Jawa"));
        rempahs.add(new GridJfy(R.drawable.bunga_lawang, "Bunga Lawang"));
        rempahs.add(new GridJfy(R.drawable.cengkeh, "Cengkeh"));
        rempahs.add(new GridJfy(R.drawable.pala, "Pala"));
        rempahs.add(new GridJfy(R.drawable.seledri, "Seledri"));

        RecyclerView lstBahan = (RecyclerView) findViewById(R.id.rvDetailJfy);
        JfyDetailAdapter adapter = new JfyDetailAdapter(this, rempahs);

        lstBahan.setLayoutManager(new GridLayoutManager(this,3));
        lstBahan.setAdapter(adapter);
    }

}
