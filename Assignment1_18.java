package Assignment_No_1;//factorial

import java.util.Scanner;

public class Assignment1_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number=0 ,fact=0;
        System.out.println("Enter a number to find out factorial of number : ");
        number = scan.nextInt();

        fact = factorial(number);
        System.out.println("Factorial of number is : "+fact);
    }
    static int factorial(int number) {
        int fact1 = 1;

            while(number>=1) {
                fact1 = fact1 * number;
                number--;
            }
            return fact1;

        }

}
