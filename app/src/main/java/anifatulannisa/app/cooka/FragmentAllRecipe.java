package anifatulannisa.app.cooka;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by annisatahira on 07/01/19.
 */

public class FragmentAllRecipe extends Fragment {

    View v;

    public FragmentAllRecipe() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.allrecipe_fragment,container,false);
        return v;
    }
}
