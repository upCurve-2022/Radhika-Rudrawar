package Assignment_No_1;

import java.util.Scanner;

public class Assignment1_27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;
        System.out.println("Enter a Number : ");
        number = scan.nextInt();

        boolean result = armstrong_number(number);
        if(result==true){
            System.out.println("Given number is armstrong number .");
        }
        else{
            System.out.println("Given number is not armstrong number .");
        }
    }

    static boolean armstrong_number(int number){
        int rem,sum=0,n=number;
        while(number>0){
            rem = number%10;
            sum = sum + rem*rem*rem;
            number=number/10;
        }
        if(n!=sum)
                return false;
        return true;
    }
}
