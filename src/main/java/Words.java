import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Random;

public class Words {




   static  Random random = new Random();
    public static String [] words = {"ELEPHANT", "PIGEON", "TIGER", "BEAR"};
    static int  index = random.nextInt(words.length);

    public ArrayList<String> getSymbolsArrayList() {
        return symbolsArrayList;
    }

    public static ArrayList<String> symbolsArrayList = new ArrayList<>();

    public static String getWord(){
        return words[index];

    }

//public static ArrayList changeTransformedWord(char guessChar) {
//        for ()
//
//}



    public static ArrayList transformedWord(String word){

        for(int i=0; i<word.length(); i++){
            symbolsArrayList.add("_");

        }

        return symbolsArrayList;
    }




}
