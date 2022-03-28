package javaChallenges;

import java.util.Scanner;

public class Assignment3_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the year : ");
        int year = scan.nextInt();

        if((year%4==0)||(year%100==0)&&(year%400==0)){
            System.out.println("Given year is leap year .");
        }
        else{
            System.out.println("Given year is not leap year .");
        }
    }
}
