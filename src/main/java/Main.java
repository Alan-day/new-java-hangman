import java.util.ArrayList;
import java.util.Scanner;

import java.util.Scanner;
public class Main {




    public static void main(String[] args) {

        DisplayGraphicResults hangmanResults = new DisplayGraphicResults();
        ArrayList <Character> charactersArrayList = new ArrayList<>();

        System.out.println(
                "Welcome to a game of hangman. You have 8 chances to guess a word from the category of zoology. Good luck!" );



        Words word = new Words();

        DisplayResults results = new DisplayResults();





        results.getRemainingLives();

        UserInput myNewInput = new UserInput();



        String guessThisWord = word.getWord();
        ArrayList secretArray = word.getSymbolsArrayList();

        for (int i = 0; i < guessThisWord.length(); i++) {
            charactersArrayList.add(guessThisWord.charAt(i));
        }



        word.transformedWord(guessThisWord);
        System.out.println(secretArray);

        while (results.getRemainingLives() > 0  && !secretArray.equals(charactersArrayList)) {
            System.out.println("Please enter a character");

            String userString = myNewInput.getMyInput();

           char userCharacter = userString.toUpperCase().charAt(0);



            if(charactersArrayList.contains(userCharacter)) {

                for (int i = 0; i < charactersArrayList.size(); i++) {
                    if (charactersArrayList.get(i).equals(userCharacter)) {
                        secretArray.set(i, userCharacter);
                    }
                }

                System.out.println(secretArray);
                System.out.println("remaining lives: " + results.getRemainingLives());

            }

            else {
                System.out.println("Wrong guess!");
                System.out.println(secretArray);
                results.takeawayLives();
                hangmanResults.takeawayLives();
                System.out.println("remaining lives: " + results.getRemainingLives());

                System.out.println(hangmanResults.getRemainingLives());

                }

            if (secretArray.equals(charactersArrayList)) {

                System.out.println("Congratulations, you win!");
                System.out.println("The secret word was:");
                System.out.println(charactersArrayList);


            } else if (!secretArray.equals(charactersArrayList) && results.getRemainingLives() == 0) {
                System.out.println("Better luck next time");
                System.out.println("The secret word was:");
                System.out.println(charactersArrayList); // change to String

            }

        }



        }


    }



