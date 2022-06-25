import java.util.Random;

/**
 * This class is used to build Die objects that can be randomly rolled.
 * 
 * @author Seth Zerwas
 *
 */
public class Die {
    private int faceValue;

    /**
     * This constructor builds a Die object and sets the initial face value to 1.
     */
    public Die() {
        faceValue = 1;

    }

    /**
     * This method returns the current face value of the die.
     * 
     * @return The current face value of the Die object.
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * This method rolls the current Die, resulting in the face value being a random
     * value from 1 to 6.
     */
    public void roll() {
        Random generator = new Random();
        faceValue = generator.nextInt(6) + 1;

    }

    /**
     * Method to print out the value of the die in '*'
     */
    @Override
    public String toString() {
        String printStar = "";
        for (int i = 0; i < faceValue; i++) {
            printStar = printStar + "* ";
        }
        return printStar;
    }

}
