package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by lcremer on 9/14/15.
 */
public abstract class TweetMood {
    private  String mood;
    private Date date;

    public TweetMood(String mood) {
        this.mood = mood;
        this.date = new Date();
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String whatMood();
}
