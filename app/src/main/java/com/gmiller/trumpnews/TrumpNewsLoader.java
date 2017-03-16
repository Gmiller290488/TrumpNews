package com.gmiller.trumpnews;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by dell on 16/03/2017.
 */

public class TrumpNewsLoader extends AsyncTaskLoader<List<TrumpNews>> {

    /**
     * Tag for log messages
     */
    private static final String LOG_TAG = TrumpNewsLoader.class.getName();

    /**
     * Query URL
     */
    private String mUrl;

    /**
     * Constructs a new {@link TrumpNewsLoader}.
     *
     * @param context of the activity
     * @param url     to load data from
     */
    public TrumpNewsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    /**
     * This is on a background thread.
     */
    @Override
    public List<TrumpNews> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<TrumpNews> news = QueryUtils.fetchTrumpNewsData(mUrl);
        return news;
    }
}
