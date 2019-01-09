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
 * Created by annisatahira on 08/01/19.
 */

public class DetailActivityBahan extends AppCompatActivity {

    List<GridJfy> bahans;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_jfy);

        bahans = new ArrayList<>();
        bahans.add(new GridJfy(R.drawable.brokoli, "Brokoli"));
        bahans.add(new GridJfy(R.drawable.buncis, "Buncis"));
        bahans.add(new GridJfy(R.drawable.kangkung, "Kangkung"));
        bahans.add(new GridJfy(R.drawable.kol, "Kol"));
        bahans.add(new GridJfy(R.drawable.sawi, "Sawi"));

        RecyclerView lstBahan = (RecyclerView) findViewById(R.id.rvDetailJfy);
        JfyDetailAdapter adapter = new JfyDetailAdapter(this, bahans);

        lstBahan.setLayoutManager(new GridLayoutManager(this,3));
        lstBahan.setAdapter(adapter);
    }
}
