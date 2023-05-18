import java.util.ArrayList;
import java.util.Scanner;

import java.util.Scanner;
public class Main {








    public static void main(String[] args) {





        Words word = new Words();
        DisplayResults results = new DisplayResults("Word");





        results.getRemainingLives();
        Scanner myInput = new Scanner(System.in);






        ArrayList<Character> charactersArrayList = new ArrayList<>();


        String guessWord = word.getWord();

        for (int i = 0; i < guessWord.length(); i++) {
            charactersArrayList.add(guessWord.charAt(i));
        }

        System.out.println(charactersArrayList);

        word.transformedWord(guessWord);


        while (results.getRemainingLives() > 0) { ////////////here is my while loop
           String input = myInput.nextLine();

           String userCharacter = input;

            if(userCharacter.equals(charactersArrayList)) {





            }



            System.out.println(word.getSymbolsArrayList());
            results.takeawayLives();
            System.out.println("remaining lives: " + results.getRemainingLives());
        }



        System.out.println(word.getWord());
        System.out.println(results.transformedResults());
    }





    //while loop (while lives != 0)
    // input always in uppercase ( toUpper() )
    // import java.util.Scanner;
    // Scanner myObj = new Scanner(System.in)
    // userInput = myObj.nextLine();
    // class DisplayResults
    // class storeUserInput
    // class Game (Main)
    // class random word selection
    // transform word to underscore
    // 	boolean find(userInput)
    //  class random wordSelect
    //  index[Random]
}
