package Assignment_No_1;//swapping of 3 numbers

import java.util.Scanner;

public class Assignment1_4B {
    static int first_number, second_number, third_number;
    static void swapping(){

        first_number = first_number+second_number+third_number;

        second_number = first_number - (second_number+third_number);

        third_number = first_number - (second_number+third_number);

        first_number = first_number - (second_number+third_number);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        first_number = scan.nextInt();
        System.out.println("Enter Second Number : ");
        second_number = scan.nextInt();
        System.out.println("Enter Third Number : ");
        third_number = scan.nextInt();

        System.out.println("Before Swapping : ");
        System.out.println("First number = " + first_number);
        System.out.println("Second Number = " + second_number);
        System.out.println("Third Number = " + third_number);

        swapping();

        System.out.println("After Swapping : ");
        System.out.println("first_number = " + first_number);
        System.out.println("second_number = " + second_number);
        System.out.println("Third Number = " + third_number);

    }
}
