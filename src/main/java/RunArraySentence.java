import arraySentence.ArraySentence;

public class RunArraySentence {
    public static void main(String[] args) {

        ArraySentence arraySentence = new ArraySentence();
        arraySentence.add("1) qqqqq");
        arraySentence.add("2) wwwwww");
        arraySentence.add("3) eeeee");
        arraySentence.add("4) qqqqq");
        arraySentence.add("5) wwwwww");
        arraySentence.add("6) eeeee");
        arraySentence.add("7) qqqqq");
        arraySentence.add("8) wwwwww");
        arraySentence.add("9) eeeee");
        arraySentence.add("10) qqqqq");

        arraySentence.GetRandom(3);
        System.out.println("------");
//        arraySentence.sout();
    }
}
