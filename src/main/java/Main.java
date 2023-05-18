import java.util.ArrayList;
import java.util.Scanner;

import java.util.Scanner;
public class Main {


//    public static ArrayList changeTransformedWord(String guessChar, ArrayList transformedWord) {
//        for (int i=0; i<transformedWord.length(); i++ ){
//            if(transformedWord == guessChar){
//                transformedWord.set(i, guessChar);
//
//            }
//        }
//
//    }





    public static void main(String[] args) {





        Words word = new Words();
        DisplayResults results = new DisplayResults("Word");





        results.getRemainingLives();
        Scanner myInput = new Scanner(System.in);






        ArrayList <Character> charactersArrayList = new ArrayList<>();


        String guessThisWord = word.getWord();
        ArrayList secretArray = word.getSymbolsArrayList();
        for (int i = 0; i < guessThisWord.length(); i++) {
            charactersArrayList.add(guessThisWord.charAt(i));
        }

        System.out.println(charactersArrayList); // array of letters

        word.transformedWord(guessThisWord);


        while (results.getRemainingLives() >0  && !secretArray.equals(charactersArrayList)) { ////////////here is my while loop

           String userCharacter = myInput.next();

           char cleanInput = userCharacter.charAt(0);

            System.out.println(cleanInput);

            if(charactersArrayList.contains(cleanInput)) {



                int index = charactersArrayList.indexOf(cleanInput);
                secretArray.set(index, cleanInput);

                System.out.println(secretArray);
                System.out.println(charactersArrayList);

                System.out.println("remaining lives: " + results.getRemainingLives());

            } else {

                System.out.println("not ok");
                System.out.println(secretArray);
                results.takeawayLives();
                System.out.println("remaining lives: " + results.getRemainingLives());
                }


            }




             // transformed array of letters


        }




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

