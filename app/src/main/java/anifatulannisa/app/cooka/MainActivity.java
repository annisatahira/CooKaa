package anifatulannisa.app.cooka;

import android.graphics.Color;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import anifatulannisa.app.cooka.fragment.FragmentAllRecipe;
import anifatulannisa.app.cooka.fragment.FragmentJfy;

/**
 * Created by annisatahira on 07/01/19.
 */

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    private TabLayout tabLayout ;
    private ViewPager viewPager ;
    private ViewPageAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPageAdapter(getSupportFragmentManager());

        //tambah fragment
        adapter.AddFragment(new FragmentJfy(), "Just For You");
        adapter.AddFragment(new FragmentAllRecipe(), "All Recipe");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#634c40"));
        tabLayout.setSelectedTabIndicatorHeight((int) (5 * getResources().getDisplayMetrics().density));
        tabLayout.setTabTextColors(Color.parseColor("#727272"), Color.parseColor("#ffffff"));
        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);
    }


}
