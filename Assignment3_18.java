package javaChallenges;

import java.util.Scanner;

public class Assignment3_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first Number : ");
        int num1 = scan.nextInt();

        System.out.println("Enter second Number : ");
        int num2 = scan.nextInt();

        System.out.println("Enter third Number : ");
        int num3 = scan.nextInt();

        int max = (num1>num2) ? ( (num1>num3) ? num1 :num3 ):( (num2>num3) ? num2 : num3);

        System.out.println("Largest Number is : "+ max);

    }
}
