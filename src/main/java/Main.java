import java.util.ArrayList;
import java.util.Scanner;

import java.util.Scanner;
public class Main {




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


        while (results.getRemainingLives() > 0  && !secretArray.equals(charactersArrayList)) { ////////////here is my while loop

            System.out.println("Please enter a character");







           String userCharacter = myInput.next();

           char cleanInput = userCharacter.toUpperCase().charAt(0);



            if(charactersArrayList.contains(cleanInput)) {

                for (int i = 0; i < charactersArrayList.size(); i++) {
                    if (charactersArrayList.get(i).equals(cleanInput)) {
                        secretArray.set(i, cleanInput);
                    } else {}}

                System.out.println(secretArray);
                System.out.println("remaining lives: " + results.getRemainingLives());

            }




            else {
                System.out.println("Wrong guess!");
                System.out.println(secretArray);
                results.takeawayLives();
                System.out.println("remaining lives: " + results.getRemainingLives());
                }

            if (secretArray.equals(charactersArrayList)) {

                System.out.println("Congratulations, you win!");
            } else if (!secretArray.equals(charactersArrayList) && results.getRemainingLives() == 0) {
                System.out.println("Better luck next time");
                System.out.println("The secret word was:");
                System.out.println(charactersArrayList); // change to String
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

