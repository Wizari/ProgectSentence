import arraySentence.*;

public class Main {
    public static void main(String[] args) {

        IArraySentence arraySentence = new ArraySentence();

        ((ArraySentence) arraySentence).myArray.add("1) q");
        ((ArraySentence) arraySentence).myArray.add("2) w");
        ((ArraySentence) arraySentence).myArray.add("3) qt");
        ((ArraySentence) arraySentence).myArray.add("4) yq");
        ((ArraySentence) arraySentence).myArray.add("5) yq");
        ((ArraySentence) arraySentence).myArray.add("6) qu");
        ((ArraySentence) arraySentence).myArray.add("7) iq");
        ((ArraySentence) arraySentence).myArray.add("8) qo");
        ((ArraySentence) arraySentence).myArray.add("9) qp");
        ((ArraySentence) arraySentence).myArray.add("10) q[");

        new PrintArray((ArraySentence) arraySentence);
        System.out.println("-----------------");
        new GetSomeRandomItems(3, (ArraySentence) arraySentence);
    }
}
