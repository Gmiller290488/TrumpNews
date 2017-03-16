package com.gmiller.trumpnews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by dell on 16/03/2017.
 */

public class TrumpNewsAdapter extends ArrayAdapter<TrumpNews> {

    /**
     * Constructs a new {@link TrumpNewsAdapter}.
     *
     * @param context   of the app
     * @param trumpnews is the list of news articles, which is the data source of the adapter
     */
    public TrumpNewsAdapter(Context context, List<TrumpNews> trumpnews) {
        super(context, 0, trumpnews);
    }

    /**
     * Returns a list item view that displays information about the news article at the given position
     * in the list of trumpnews.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.trumpnews_list_item, parent, false);
        }

        // Find the TrumpNews at the given position in the list of news articles
        TrumpNews currentNews = getItem(position);

        // Find the TextView with view ID category
        TextView categoryView = (TextView) listItemView.findViewById(R.id.category);
        // Display the category of the current news article in that TextView
        categoryView.setText(currentNews.getCategory());

        // Find the TextView with view ID title
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        // Display the title string from the TrumpNews object
        titleView.setText(currentNews.getTitle());

        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);

        //String formattedDate = currentNews.getDate().substring(0, 10);
        String date = currentNews.getDate().substring(0, 10);

        // Rearrange the date to be dd-mm-yy
        String formattedDate = date.substring(8, 10) + date.substring(4, 8) + date.substring(2, 4);

        // Display the formatted date the TrumpNews was published in that TextView
        dateView.setText(formattedDate);


// Return the list item view that is now showing the appropriate data
        return listItemView;
    }


}
