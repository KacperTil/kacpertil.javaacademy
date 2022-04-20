
public class Main {

    public static void main (String[] args){
        
        String word = args[0];

        CountLetters countLetters = new CountLetters(word);
        countLetters.count();
    }
}
