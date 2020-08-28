package arraySentence;

import java.util.ArrayList;
import java.util.Collections;

public class GetSomeRandomItems {
    public GetSomeRandomItems(int number, ArraySentence arrayList) {
        ArrayList shuffle = new ArrayList<String>(arrayList.myArray);
        Collections.shuffle(shuffle);
        int x = 0;
        while (number > x) {
            System.out.println(shuffle.get(x));
            x++;
        }
    }
}

