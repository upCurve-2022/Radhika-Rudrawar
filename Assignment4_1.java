package String_Assignment;

import java.util.Scanner;

public class Assignment4_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = scan.nextLine();

        System.out.println(str.hashCode());

        System.out.println("Enter a string to concate with another string  : ");
        String str2 = scan.nextLine();

        str = str+str2;
        System.out.println("After concatations : "+str);
        System.out.println(str.hashCode());

        System.out.println("Here we can say that hash code of first string is changes after concatatinos");
        System.out.println("so we can say that strings are IMMUTABLE.");

    }
}
