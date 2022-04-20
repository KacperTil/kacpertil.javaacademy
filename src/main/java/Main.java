import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        CountLetters countLetters = new CountLetters(word);
        countLetters.count();
    }
}
