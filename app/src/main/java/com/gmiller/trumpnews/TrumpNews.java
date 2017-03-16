package com.gmiller.trumpnews;

/**
 * Created by dell on 16/03/2017.
 */

public class TrumpNews {
    /**
     * Category of the article
     */
    private String mCategory;

    /**
     * Title of the article
     */
    private String mTitle;

    /**
     * Date of publication
     */
    private String mDate;

    /**
     * Website URL of the article
     */
    private String mUrl;

    /**
     * Constructs a new {@link TrumpNews} object.
     *
     * @param category is the category of the article
     * @param title    is the Title of the article
     * @param date     is date at which the article was published online
     * @param url      is the website URL to find more details about the article
     */
    public TrumpNews(String category, String title, String date, String url) {
        mCategory = category;
        mTitle = title;
        mDate = date;
        mUrl = url;
    }

    /**
     * Returns the category that the article belongs to
     */
    public String getCategory() {
        return mCategory;
    }

    /**
     * Returns the title of the article.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the date the article was published.
     */
    public String getDate() { return mDate; }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }
}
