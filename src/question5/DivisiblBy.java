package question5;
/*
 Divisible by 3,5 15Write a program that can print the numbers between 1~ 100 that can be divisible by 3,5 and 15.if the number can be divisible by 3,5 and then it should be displayed in Divisible by 15’ sectionif the number can be divisible by 3 but can not be divisible by 15. then it should be only displayed in divisible by 3 sections.if the number can be divisible by 5 but can not be divisible by 15. then it should be only be displayed in the Divisible by 5 sections.ex:Output:Divisible by 15 15 30 45 60 75 90Divisible by 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
 */


public class DivisiblBy{
    public static void main(String[] args) {
        System.out.println("\nDivided by 3: ");
        for (int i=1; i<100; i++) {
            if (i%3==0)
                System.out.print(i +", ");
        }
        System.out.println("\n\nDivided by 5: ");
        for (int i=1; i<100; i++) {
            if (i%5==0) System.out.print(i +", ");
        }

        System.out.println("\n\nDivided by 3 & 5: ");
        for (int i=1; i<100; i++) {
            if (i%3==0 && i%5==0) System.out.print(i +", ");
        }
        System.out.println("\n");
    }
}



