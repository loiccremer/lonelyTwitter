package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by lcremer on 9/14/15.
 */
public class NormalTweet extends Tweet implements Tweetable {
    public NormalTweet(String text, Date date) {
        super(text, date);
    }

    public NormalTweet(String text) {
        super(text);
    }

    public Boolean isImportant() {
        return Boolean.FALSE;

    }
}
