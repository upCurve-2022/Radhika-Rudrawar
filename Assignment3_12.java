package javaChallenges;

import java.util.Scanner;

public class Assignment3_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first String : ");
        String str1 = scan.nextLine();

        System.out.println("Enter second String : ");
        String str2 = scan.nextLine();

        System.out.println("Concatation of string is : "+(str1+str2));
    }
}
