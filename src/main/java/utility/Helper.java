package utility;


public class Helper {

    public static int getRandom(int from, int to) {
        int randomNumber = from + (int) (Math.random() * to);
        return randomNumber;
    }



}

