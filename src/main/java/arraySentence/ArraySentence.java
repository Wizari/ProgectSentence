package arraySentence;

import java.util.ArrayList;

public class ArraySentence implements IArraySentence {
    private ArrayList myArray;

    public ArraySentence() {
        this.myArray = new ArrayList<String>();
    }

    public void add(String sentence) {
        this.myArray.add(sentence);
    }

    public void PrintArray() {
        new PrintArray(myArray);
    }

    public void GetRandom(int number) {
        new GetSomeRandomItems(number, myArray);
    }
}
