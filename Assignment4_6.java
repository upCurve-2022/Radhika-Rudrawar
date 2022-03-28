package String_Assignment;

import java.util.Scanner;

public class Assignment4_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first String : ");
        String str1 = scan.nextLine();

        System.out.println("Enter second String : ");
        String str2 = scan.nextLine();

        System.out.println("There are 2 methods to compare the strings : ");
        System.out.println("1. Equals method");
        boolean result = equals_method(str1,str2);
        if(result==true){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        System.out.println("2.compareTo method");
        compareTo_Method(str1,str2);
    }

    public static boolean equals_method(String str1 , String str2){
        return str1.equals(str2);
    }

    public static void compareTo_Method(String str1,String str2){
        System.out.println("Answer of compareTo method : ");
        int result = str1.compareTo(str2);
        if(result==0){
            System.out.println("Strings are equal .");
        }
        else {
            System.out.println("Strings are not equal .");
        }
    }
}
