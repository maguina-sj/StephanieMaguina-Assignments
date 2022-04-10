// import java.util.Random;
import java.util.ArrayList;
public class PuzzleTest {
    public static void main(String[] args) {
        PuzzleJava appTest = new PuzzleJava();
        ArrayList<Integer> randomRolls = appTest.getTenRolls();
        System.out.println("\nWanna random list of numbers? Here ya go!: ");
        System.out.println(randomRolls);
        System.out.println(appTest.getRandomLetter());
        System.out.println(appTest.generatePassword());
        System.out.println(appTest.getNewPasswordSet(5));
    }
}
