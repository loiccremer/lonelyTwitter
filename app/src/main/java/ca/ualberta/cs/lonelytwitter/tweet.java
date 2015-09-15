package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by lcremer on 9/14/15.
 *
 * we don't want to allow someone to go wet.text = ""
 * we want to force them to call the method instead.
 * good java coding style has theFirst word lowercase and theSecond word uppercase
 * Classes have a Capital at the Front
 * object orientation is defined by inheritence
 */
public abstract class Tweet {
    protected String text;
    private Date date;

    public Tweet(String text, Date date) {
        this.text = text;
        this.date = date;
    }

    public Tweet(String text) {
        this.text = text;
        date = new Date();
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    // . dot operator in jave is basically x-> in C

    public void setText(String text) {
        if (text.length() <= 140) {
            this.text = text;
        } else {
       throw new IllegalArgumentException("Tweet was too long, you narp!");
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract Boolean isImportant();
}
