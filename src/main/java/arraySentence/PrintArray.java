package arraySentence;

public class PrintArray {
    public PrintArray(ArraySentence array) {
        int x = 0;
        while (array.myArray.size() > x) {
            System.out.println(array.myArray.get(x));
            x++;
        }
    }
}
