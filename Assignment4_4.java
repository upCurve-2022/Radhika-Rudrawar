package String_Assignment;

import java.util.Scanner;

public class Assignment4_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = scan.nextLine();

        boolean check = str.isEmpty();

        if(check==true){
            System.out.println("String is empty");
        }
        else{
            System.out.println("String is not empty");
        }
    }
}
