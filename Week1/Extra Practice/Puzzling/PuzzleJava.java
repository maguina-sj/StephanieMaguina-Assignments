import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    public ArrayList<Integer> getTenRolls() {
        Random randMachine = new Random(); //new instance of Random
        ArrayList<Integer> numArray = new ArrayList<Integer>(); // new instance of an Integer ArrayList
        for (int i = 0; i <10; i++) {
            numArray.add(randMachine.nextInt(21));
        }
        return numArray;
    }
    public String getRandomLetter() {
        Random rand = new Random();
        String[] abcs = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int randomInt = rand.nextInt(26);
        String randLetter = abcs[randomInt];
        return randLetter;
    }
    public String generatePassword() {
        String password = "";
        for (int i =0; i<8; i++) {
            password = password + getRandomLetter();
        }
        return password;
    }
    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> newPassword = new ArrayList<String>();
        for (int i=0; i<length;i++) {
            newPassword.add(generatePassword());
        }
        return newPassword;
    }
}