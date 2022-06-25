import java.util.Scanner;

/**
 * Starts a game of Tenzi, which is a dice game where you must get all 10 die to
 * show the same value.
 * 
 * @author Seth Zerwas
 *
 */
public class TenziDriver {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String answer = "Y";
        String diceToRoll;
        Leaderboard board = new Leaderboard();
        while (answer.equals("Y")) {
            TenziGame game = new TenziGame();
            while (game.isOver() != true) {
                System.out.println(game.toString());
                System.out.print("Which to roll: ");
                diceToRoll = keyboard.next();
                game.roll(splitToInts(diceToRoll));

            }
            System.out.println(game.toString());
            System.out.println("Game Over. You used " + game.getTurns() + " turns and " + game.getTimeElapsed() / 1000.0
                    + " seconds");
            board.update(game.getTimeElapsed());
            System.out.println(board.toString());

            System.out.print("Play again? (Y/N) ");
            answer = keyboard.next();
        }

    }

    /**
     * Method to split the user input which is a string into an integer array to be
     * read by the program.
     * 
     * @param rollingDice User input dice to be re-rolled
     * @return Returns an integer array containing the numbers input by the user.
     */
    public static int[] splitToInts(String rollingDice) {
        String[] diceString = rollingDice.split(",");
        int[] diceInt = new int[diceString.length];
        for (int i = 0; i < diceString.length; i++) {
            int diceNum = Integer.parseInt(diceString[i]);
            diceInt[i] = diceNum;
        }
        return diceInt;

    }

}
