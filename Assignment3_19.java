package javaChallenges;

import java.util.Scanner;

public class Assignment3_19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int n = scan.nextInt();

        boolean result = ugly_numbers(n);
        if(result==true){
            System.out.println("Given number is ugly number");
        }
        else{
            System.out.println("Given number is not ugly number");
        }
    }

    public static boolean ugly_numbers(int number){
        if(number==1){
            return true;
        }
        if(number<=0){
            return false;
        }
        if(number%2==0){
            return ugly_numbers(number/2);
        }
        if(number%3==0){
            return ugly_numbers(number/3);
        }
        if(number%5==0){
            return ugly_numbers(number/5);
        }
        return false;
    }
}
