package anifatulannisa.app.cooka;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import anifatulannisa.app.cooka.fragment.FragmentAllRecipe;
import anifatulannisa.app.cooka.fragment.FragmentBahan;
import anifatulannisa.app.cooka.fragment.FragmentJfy;
import anifatulannisa.app.cooka.fragment.FragmentPembuatan;
import anifatulannisa.app.cooka.fragment.FragmentPendahuluan;

/**
 * Created by annisatahira on 09/01/19.
 */

public class DetailActivityRecipe extends AppCompatActivity {

    private TabLayout tabLayout ;
    private ViewPager viewPager ;
    private ViewPageAdapter adapter;

    ImageView imgDetail;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_recipe);

        tabLayout = (TabLayout) findViewById(R.id.tablayout2_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager2_id);
        adapter = new ViewPageAdapter(getSupportFragmentManager());

        //tambah fragment
        adapter.AddFragment(new FragmentPendahuluan(), "Pendahuluan");
        adapter.AddFragment(new FragmentBahan(), "Bahan");
        adapter.AddFragment(new FragmentPembuatan(), "Cara Memasak");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#634c40"));
        tabLayout.setSelectedTabIndicatorHeight((int) (5 * getResources().getDisplayMetrics().density));
        tabLayout.setTabTextColors(Color.parseColor("#727272"), Color.parseColor("#701f3b"));
        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);

        imgDetail = (ImageView) findViewById(R.id.img_detail_recipe);

        getData();



    }

    private void getData() {

        Glide.with(this).load(getIntent().getIntExtra("id_img_detail_recipe", 0)).into(imgDetail);
    }


}
