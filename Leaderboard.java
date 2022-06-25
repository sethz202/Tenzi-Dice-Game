import java.util.ArrayList;

/**
 * Class to create a leader board containing the best times of latest
 * consecutive games.
 * 
 * @author Seth Zerwas
 *
 */
public class Leaderboard {
    private ArrayList<Long> bestTimes = new ArrayList<Long>();

    /**
     * Method to update the leader board with the latest game time
     * 
     * @param time The time taken for the most recent game to run
     */
    public void update(long time) {
        if (bestTimes.size() == 0) {
            bestTimes.add(time);
        } else {
            bestTimes.add(time);
            for (int i = 0; i < bestTimes.size(); i++) {
                for (int j = bestTimes.size() - 1; j > i; j--) {
                    if (bestTimes.get(i) > bestTimes.get(j)) {
                        long times = bestTimes.get(i);
                        bestTimes.set(i, bestTimes.get(j));
                        bestTimes.set(j, times);
                    }
                }
            }
        }
    }

    /**
     * Method creates the leader board
     */
    @Override
    public String toString() {
        String leaderboard = "";
        leaderboard = leaderboard + "--Current Leaderboard (in seconds)--";
        for (int l = 0; l < bestTimes.size(); l++) {
            leaderboard = leaderboard + "\n" + (l + 1) + ". " + bestTimes.get(l) / 1000.0;
        }

        return leaderboard;
    }
}
