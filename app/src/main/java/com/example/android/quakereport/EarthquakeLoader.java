package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PRAVIN on 2/1/2017.
 */
public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {
    private String pUrl;

    public EarthquakeLoader(Context context, String url) {
        super(context);
        pUrl=url;

        // TODO: Finish implementing this constructor
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        if(pUrl==null)
        {return null;
        }
        // Perform the HTTP request for earthquake data and process the response.
        ArrayList<Earthquake> earthquake = QueryUtils.extractEarthquakes(pUrl);
        return earthquake;
        // TODO: Implement this method
    }
}