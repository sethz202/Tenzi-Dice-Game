import java.util.ArrayList;

/**
 * Class creates the Tenzi game
 * 
 * @author Seth Zerwas
 *
 */
public class TenziGame {
    private int turns = 0;
    private long startTime = System.currentTimeMillis(); // gets current time when game starts
    private long endTime;
    private ArrayList<Die> theDice = new ArrayList<Die>();

    /**
     * Starts the game by creating 10 dice objects and rolls them
     */
    public TenziGame() {
        Die die0 = new Die();
        Die die1 = new Die();
        Die die2 = new Die();
        Die die3 = new Die();
        Die die4 = new Die();
        Die die5 = new Die();
        Die die6 = new Die();
        Die die7 = new Die();
        Die die8 = new Die();
        Die die9 = new Die();
        die0.roll();
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
        die6.roll();
        die7.roll();
        die8.roll();
        die9.roll();
        theDice.add(die0);
        theDice.add(die1);
        theDice.add(die2);
        theDice.add(die3);
        theDice.add(die4);
        theDice.add(die5);
        theDice.add(die6);
        theDice.add(die7);
        theDice.add(die8);
        theDice.add(die9);
    }

    /**
     * Method to check if the game is over
     * 
     * @return Returns true if the game is over and false if not
     */
    public boolean isOver() {
        if (theDice.get(0).getFaceValue() == theDice.get(1).getFaceValue()
                && theDice.get(1).getFaceValue() == theDice.get(2).getFaceValue()
                && theDice.get(2).getFaceValue() == theDice.get(3).getFaceValue()
                && theDice.get(3).getFaceValue() == theDice.get(4).getFaceValue()
                && theDice.get(4).getFaceValue() == theDice.get(5).getFaceValue()
                && theDice.get(5).getFaceValue() == theDice.get(6).getFaceValue()
                && theDice.get(6).getFaceValue() == theDice.get(7).getFaceValue()
                && theDice.get(7).getFaceValue() == theDice.get(8).getFaceValue()
                && theDice.get(8).getFaceValue() == theDice.get(9).getFaceValue()) {
            return true;
        }
        return false;
    }

    /**
     * Method will roll the dice input by user
     * 
     * @param dice Is an integer array of the dice to re-roll given by user
     */
    public void roll(int[] dice) {
        for (int i : dice) {
            theDice.get(i).roll();
            theDice.set(i, theDice.get(i));
        }

    }

    /**
     * Method to get the total time that the game was running
     * 
     * @return Returns a long which contains the total play time of the game
     */
    public long getTimeElapsed() {
        // having issues converting from long to double so time
        // can be shown to the third decimal place.
        endTime = System.currentTimeMillis();
        long timeElapsed = (endTime - startTime);
        return timeElapsed;
    }

    /**
     * Method to get the total number of turns the game took
     * 
     * @return Returns an integer with the total turns
     */
    public int getTurns() {
        if (isOver() == false) {
            turns = turns + 1;
        }
        return turns;
    }

    /**
     * Method will create the game board.
     */
    @Override
    public String toString() {
        String gameboard = "";
        gameboard = gameboard + "0: " + theDice.get(0);
        gameboard = gameboard + "\n1: " + theDice.get(1);
        gameboard = gameboard + "\n2: " + theDice.get(2);
        gameboard = gameboard + "\n3: " + theDice.get(3);
        gameboard = gameboard + "\n4: " + theDice.get(4);
        gameboard = gameboard + "\n5: " + theDice.get(5);
        gameboard = gameboard + "\n6: " + theDice.get(6);
        gameboard = gameboard + "\n7: " + theDice.get(7);
        gameboard = gameboard + "\n8: " + theDice.get(8);
        gameboard = gameboard + "\n9: " + theDice.get(9);
        gameboard = gameboard + "\n";
        getTurns();
        return gameboard;
    }

}
