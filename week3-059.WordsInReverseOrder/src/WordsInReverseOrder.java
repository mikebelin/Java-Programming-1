import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.println("Type a word: ");
        String word = reader.nextLine();
        words.add(word);

        while(true){
            System.out.println("Type a word: ");
            word = reader.nextLine();
            if(word.isEmpty()){
                Collections.reverse(words);
                System.out.println("You typed the following words: ");
                for(String wordz : words){
                    System.out.println(wordz);
                }break;
            }else{
                words.add(word);
            }
        }
    }
}
