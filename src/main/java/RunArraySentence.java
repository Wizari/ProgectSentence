import arraySentence.ArraySentence;
import arraySentence.IArraySentence;

public class RunArraySentence {
    public static void main(String[] args) {

        IArraySentence arraySentence = new ArraySentence();
        arraySentence.add("1) q");
        arraySentence.add("2) w");
        arraySentence.add("3) e");
        arraySentence.add("4) r");
        arraySentence.add("5) t");
        arraySentence.add("6) y");
        arraySentence.add("7) 1");
        arraySentence.add("8) 2");
        arraySentence.add("9) 3");
        arraySentence.add("10) safety");

        arraySentence.GetRandom(3);
        System.out.println("-----------------");
        arraySentence.PrintArray();
    }
}
