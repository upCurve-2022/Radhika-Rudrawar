package Assignment_No_1;//seperateing the double number into decimal and floating point numbers

import java.util.Scanner;

public class Assignment1_6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double number ;
        double int_part;
        double decimal_part ;

        System.out.println("Enter Double Number : ");
        number = scan.nextDouble();
        System.out.println("Original Number : "+number);
        decimal_part = number%1;
        int_part = number-decimal_part;//typecasting

        System.out.println("Integer Part : "+int_part);
        System.out.println("Fractinoal Part : "+decimal_part);

    }
}
