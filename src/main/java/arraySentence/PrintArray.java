package arraySentence;

import java.util.ArrayList;

public class PrintArray {
    PrintArray(ArrayList arrayList) {
        int x = 0;
        while (arrayList.size() > x) {
            System.out.println(arrayList.get(x));
            x++;
        }
    }
}
