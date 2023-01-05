package question4;

public class SwapNumbers {

    public static void main(String[] args) {
        int x = 8;
        int y = 2;

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }


}
