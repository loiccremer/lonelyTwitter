package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by lcremer on 9/14/15.
 */
public class ImportantTweet extends Tweet implements Tweetable{
    Public ImportantTweet(String Tweet, Date date) {
        // super calls the constructor of the parent class
        super(Tweet, date)
    }

    public ImportantTweet(String text) {
        super(text);
        this.setText(text);
    }
}
