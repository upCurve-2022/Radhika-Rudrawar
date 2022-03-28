package Assignment_No_1;

import java.util.Scanner;

//to check whether given number is even or odd
public class Assignment1_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number ;
        System.out.println("Enter a value to find out it is odd or even number :");
        number  = scan.nextInt();

        if(number%2==0){
            System.out.println("Even Number : "+ number );
        }
        else{
            System.out.println("Odd Number : "+number);
        }
    }
}
