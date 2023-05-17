import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Random;

public class Words {




    Random random = new Random();
    public String [] words = {"ELEPHANT", "PIGEON", "TIGER", "BEAR"};
    int index = random.nextInt(words.length);

    public ArrayList<String> getSymbolsArrayList() {
        return symbolsArrayList;
    }

    ArrayList<String> symbolsArrayList = new ArrayList<>();

    public String getWord(){
        return words[index];

    }





    public ArrayList transformedWord(){
        String newWord = getWord();
        for(int i=0; i<newWord.length(); i++){
            symbolsArrayList.add("_");

        }

        return symbolsArrayList;
    }




}
