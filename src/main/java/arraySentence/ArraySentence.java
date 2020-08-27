package arraySentence;


import java.util.ArrayList;
import java.util.Collections;

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

    void GetThreeRandom(int number) {
        ArrayList shuffle = new ArrayList<String>(myArray);
        Collections.shuffle(shuffle);
        int x = 0;
        while (number > x) {
            System.out.println(shuffle.get(x));
            x++;
        }
    }

}
