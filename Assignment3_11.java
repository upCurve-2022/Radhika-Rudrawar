package javaChallenges;

import java.util.Locale;
import java.util.Scanner;

public class Assignment3_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String to convert it into uppercase : ");
        String temp = scan.next();
        System.out.println(temp.toUpperCase());
    }
}
