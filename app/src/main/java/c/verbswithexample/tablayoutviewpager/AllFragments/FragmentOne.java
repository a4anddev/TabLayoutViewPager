package c.verbswithexample.tablayoutviewpager.AllFragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import c.verbswithexample.tablayoutviewpager.R;

public class FragmentOne extends Fragment {

    public FragmentOne(){
        Log.i("Fragment", "Frist Fragment");

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_one, container,false);
    }
}
