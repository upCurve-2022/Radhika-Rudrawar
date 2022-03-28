package String_Assignment;

import java.util.Scanner;

public class Assignment4_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String : ");

        String str = scan.nextLine();



        System.out.println("Before removing t/T : "+str);
        str=str.replace('t', ' ');
        System.out.println("After removeing t/T : "+str.replace('T', ' '));
    }



}
