package javaChallenges;

import java.util.Scanner;

public class Assignment3_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean check ;

        System.out.println("Enter first String : ");
        String str1 = scan.nextLine();

        System.out.println("Enter second String : ");
        String str2 = scan.nextLine();

        check = str1.contains(str2);

        if(check==true){
            System.out.println("Second string is present in first .");
        }
        else{
            System.out.println("Second string is not present in first .");
        }
    }
}
