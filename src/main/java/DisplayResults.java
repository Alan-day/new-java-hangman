import java.util.ArrayList;

public class DisplayResults {

    public DisplayResults() {

        this.remainingLives = 8;
    }
    private String results;
    String [] correctGuesses;

    char [] transformedResults;
    private int remainingLives;


    public char[] transformedResults() {
       char[] chars = results.toCharArray();
        return chars;
    }


    public String[] getCorrectGuesses() {
        return correctGuesses;
    }


    public void setCorrectGuesses(String[] correctGuesses) {
        this.correctGuesses = correctGuesses;
    }



    public int getRemainingLives() {

        return remainingLives;
    }
    public void setRemainingLives() {
        this.remainingLives = remainingLives;
    } //unused setter

    public void takeawayLives(){
        remainingLives -= 1;
    }









}
