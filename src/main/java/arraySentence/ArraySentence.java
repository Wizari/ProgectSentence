package arraySentence;


import java.util.ArrayList;

public class ArraySentence {
    private ArrayList myArray;

    ArraySentence() {
        this.myArray = new ArrayList<String>();
    }

    void add(String sentence) {
        this.myArray.add(sentence);

    }

    void sout() {
        int x = 0;
        while (this.myArray.size() > x) {
            System.out.println(myArray.get(x));
            x++;
        }
    }

}
