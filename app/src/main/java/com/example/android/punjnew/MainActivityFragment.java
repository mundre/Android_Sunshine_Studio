package com.example.android.punjnew;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //create some dummy data for the list view
        String[] data = {
                "mon 6/23 - sunny -32/17",
                "tues 6/24 - cold -30/17",
                "wed 6/25 - wet -35/17",
                "thur 6/26 - hot -36/17",
                "fri 6/27 - warm -30/17",
                "sat 6/28 - hot -40/17",
                "sun 6/29 - cold -41/17"
        };
        List<String> weekForecast = new ArrayList<String>(Arrays.asList(data));

        mForecastAdapter =
                new ArrayAdapter<String>(
                        getActivity(), //The current context(this activity)
                        R.layout.list_item_forecast, //the name of the layout id
                        R.id.list_item_forecast_textview, //the id of the textview to populate
                        weekForecast //forecast data
                );


        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        //get a reference to the listview and attach the adapter to it
        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);


        return rootView;
    }
}
