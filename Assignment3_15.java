package javaChallenges;

import java.util.Scanner;

public class Assignment3_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String str = "GOD";

        combination(str," ");

    }
    public static void combination(String str1 , String str2) {


        if (str1.length() == 0) {
            System.out.println(str2 + " ");

        }

        for (int i = 0; i < str1.length(); i++) {

            char ch = str1.charAt(i);

            String str = str1.substring(0, i) + str1.substring(i + 1);
            System.out.print(str+" ");
            combination(str, str2 + ch);

        }
        }
    }