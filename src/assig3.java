import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class assig3 {

    public static void main(String[] args) throws IOException{

        Scramble2 scramble2 = new Scramble2();  //Create instance of scramble2 class
        String word;
        String scramWord;
        for(int i = 0; i < 14; i++) {
            word = scramble2.getRealWord();
            System.out.println(word);
            scramWord = scramble2.getScrambledWord();
            System.out.println(scramWord);
        }
        System.out.println("Back to main");
    }

}
