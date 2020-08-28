import arraySentence.*;

public class RunArraySentence {
    public static void main(String[] args) {

        IArraySentence arraySentence = new ArraySentence();

        new Add((ArraySentence) arraySentence, "1) q");
        new Add((ArraySentence) arraySentence, "2) w");
        new Add((ArraySentence) arraySentence, "3) qt");
        new Add((ArraySentence) arraySentence, "4) yq");
        new Add((ArraySentence) arraySentence, "5) yq");
        new Add((ArraySentence) arraySentence, "6) qu");
        new Add((ArraySentence) arraySentence, "7) iq");
        new Add((ArraySentence) arraySentence, "8) qo");
        new Add((ArraySentence) arraySentence, "9) qp");
        new Add((ArraySentence) arraySentence, "10) q[");

        new PrintArray((ArraySentence) arraySentence);
        System.out.println("-----------------");
        new GetSomeRandomItems(3, (ArraySentence) arraySentence);
    }
}
