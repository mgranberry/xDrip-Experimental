package com.eveningoutpost.dexdrip.stats;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by adrian on 30/06/15.
 */
public class PercentileFragment extends Fragment {

    private PercentileView percentileView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("DrawStats", "ChartFragment onCreateView");
        return getView();
    }

    @Nullable
    @Override
    public View getView() {
        Log.d("DrawStats", "getView");

        if(percentileView == null){
            percentileView = new PercentileView(getActivity().getApplicationContext());
        }
        return percentileView;
    }
}