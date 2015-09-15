package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by lcremer on 9/14/15.
 */
public class Extravagant extends TweetMood {
    public Extravagant(String mood, Date date) {
        super(mood, date);
    }

    public whatMood(String mood) {
        super(mood);
        return("Extravagant");
    }
}
