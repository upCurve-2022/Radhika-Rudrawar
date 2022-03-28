package Assignment_No_1;//swapping of 2 numbers

import java.util.Scanner;

public class Assignment1_4A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first_number , second_number , temp ;

        System.out.println("Enter First Number : ");
        first_number = scan.nextInt();
        System.out.println("Enter Second Number : ");
        second_number = scan.nextInt();

        System.out.println("Before Swapping : " );
        System.out.println("first_number = "+first_number);
        System.out.println("second_number = "+second_number);

        temp=first_number;
        first_number=second_number;
        second_number=temp;

        System.out.println("After Swapping : " );
        System.out.println("first_number = "+first_number);
        System.out.println("second_number = "+second_number);

    }
}
