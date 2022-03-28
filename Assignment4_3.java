package String_Assignment;

import java.util.Scanner;

public class Assignment4_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = scan.nextLine();

        boolean result = contains_digit(str);
        if(result==true){
            System.out.println("It contains only digits .");
        }
        else{
            System.out.println("It does not contain only digits");
        }
    }
    public static boolean contains_digit(String str){
        for(int i = 0 ; i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                continue;
            }
            else{
                return false;
            }
        }
        return false;
    }
}
