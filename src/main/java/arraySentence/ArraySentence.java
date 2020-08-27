package arraySentence;


import java.util.ArrayList;
import java.util.Collections;

public class ArraySentence {
    private ArrayList myArray;

    public ArraySentence() {
        this.myArray = new ArrayList<String>();
    }

    public void add(String sentence) {
        this.myArray.add(sentence);
    }

    public void sout() {
        PrintArray printArray = new PrintArray(myArray);
    }

    public void GetRandom(int number) {
        GetSomeRandomItems getSomeRandomItems = new GetSomeRandomItems(number, myArray);
    }
}
