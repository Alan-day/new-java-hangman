import java.util.ArrayList;
import java.util.Scanner;

import java.util.Scanner;
public class Main {




    public static void main(String[] args) {
        ArrayList <Character> charactersArrayList = new ArrayList<>();

        System.out.println(
                "Welcome to a game of hangman. You have 8 chances to guess a word from the category of zoology. Good luck!" );
        System.out.println(" ________");
        System.out.println(" |      |");
        System.out.println(" |      O");
        System.out.println(" |     /|\\");
        System.out.println(" |     / \\");
        System.out.println(" |");
        System.out.println("_|_________");


        Words word = new Words();

        DisplayResults results = new DisplayResults();





        results.getRemainingLives();

        Scanner myInput = new Scanner(System.in);


        UserInput myNewInput = new UserInput();



        String guessThisWord = word.getWord();
        ArrayList secretArray = word.getSymbolsArrayList();

        for (int i = 0; i < guessThisWord.length(); i++) {
            charactersArrayList.add(guessThisWord.charAt(i));
        }



        word.transformedWord(guessThisWord);
        System.out.println(secretArray);

        while (results.getRemainingLives() > 0  && !secretArray.equals(charactersArrayList)) { ////////////here is my while loop
            System.out.println("Please enter a character");

            String userCharacter = myNewInput.getMyInput();

           char cleanInput = userCharacter.toUpperCase().charAt(0);



            if(charactersArrayList.contains(cleanInput)) {

                for (int i = 0; i < charactersArrayList.size(); i++) {
                    if (charactersArrayList.get(i).equals(cleanInput)) {
                        secretArray.set(i, cleanInput);
                    }
                }

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



        }


    }



