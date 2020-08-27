package arraySentence;

import java.util.ArrayList;
import java.util.Collections;

public class GetSomeRandomItems {
    GetSomeRandomItems(int number, ArrayList arrayList) {
        ArrayList shuffle = new ArrayList<String>(arrayList);
        Collections.shuffle(shuffle);
        int x = 0;
        while (number > x) {
            System.out.println(shuffle.get(x));
            x++;
        }
    }
}
