package javaChallenges;

import java.util.Scanner;

public class Assignment3_20 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = "I am always ready to learn although I do not always like being taught." ;

        System.out.println(str);
        System.out.println(str.replace('a','$'));
    }
}
