package anifatulannisa.app.cooka.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



import anifatulannisa.app.cooka.R;


/**
 * Created by annisatahira on 11/01/19.
 */

public class FragmentPendahuluan extends Fragment {

    View v;

    public FragmentPendahuluan() {

    }

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.pendahuluan_fragment, container, false);
        return v;
    }
}

