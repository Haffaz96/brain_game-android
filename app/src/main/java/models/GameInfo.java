package models;

import android.content.SharedPreferences;
import android.util.Log;
import android.view.View;

/**
 * Created by HAFFY on 3/8/2018.
 */
public class Score {

    private static int rounds; //number of rounds completed
    private static int total; //total score

    public static int getRounds() {
        return rounds;
    }

    public static void setRounds(int rounds) {
        Score.rounds = rounds;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(long timeRemaining) {
        long score = 100 / (10 - timeRemaining);
        Log.d("Time: " , String.valueOf(timeRemaining));
        Log.d("Score: ", String.valueOf(score));
        Score.total += score;
    }



}
