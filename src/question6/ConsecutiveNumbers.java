package question6;

import java.util.Scanner;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = input.nextInt();

        while (num < 0) {
            System.err.println("Number can not be negative. Try again please!!!");
            num = input.nextInt();
        }


        /*
                I feel like there is too much code
                      if you have any other solution ( maybe using switch ) let me know

         */
        for (int i = 1; i <= num; i++) {

            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("CodilityTestCoders");

            } else if (i % 2 == 0) {
                if (i % 3 == 0) {
                    System.out.println("CodilityTest");
                    continue;
                }
                if (i % 5 == 0) {
                    System.out.println("CodilityCoders");
                    continue;
                }
                System.out.println("Codility");

            } else if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println("TestCoders");
                    continue;
                }
                System.out.println("Test");

            } else if (i % 5 == 0) {
                System.out.println("Coders");
            } else {
                System.out.println(i);
            }
        }



    }
}
