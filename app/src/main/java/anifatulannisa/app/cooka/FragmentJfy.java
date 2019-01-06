package anifatulannisa.app.cooka;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by annisatahira on 07/01/19.
 */

public class FragmentJfy extends Fragment {

    View v ;

    public FragmentJfy() {
    }

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.jfy_fragment,container,false);
        return v;
    }
}
