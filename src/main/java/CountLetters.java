import java.util.TreeSet;
import static java.lang.System.out;

public class CountLetters {

    //    Instance var:
    private String word;
    private String wordWithSpace;
    private TreeSet<Character> letters = new TreeSet<Character>();
    private int numberOfLetter;

    //    Constructor:
    public CountLetters(String word) {
        if (!word.isEmpty()) {      // check: word contains characters
            if (word.contains(" ")){        // delete spaces
                this.wordWithSpace = word;
                this.word = word.replace(" ", "");
            } else {    // if word not contains spaces
                this.word = word;
            }
        } else {        // if word is empty
            throw new RuntimeException("Word is empty");
        }

    }

    //    Methods:
    public void count (){
        // Local var:
        String wordLowerCase;
        wordLowerCase = word.toLowerCase();

        out.println("Counted letters:");
        out.println(" ");

        for (int i = 0; i < word.length(); i++){    // add characters to collection
            char letter = wordLowerCase.charAt(i);
            letters.add(letter);
        }

        for (Character letterChar : letters) {      // check: repeating characters from the collection with Sting

            for (int i = 0; i < word.length(); i++){
                char letter = wordLowerCase.charAt(i);

                if (letter == letterChar) {     // increment the number of repetitions
                    numberOfLetter ++;
                }
            }
            out.println(letterChar + " = " + numberOfLetter);
            numberOfLetter = 0;
        }
        out.println(" ");
        out.println("So the argument is "+ '\u0022' + wordWithSpace + '\u0022');
    }
}


