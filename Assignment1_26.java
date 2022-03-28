package Assignment_No_1;

import java.util.Scanner;

public class Assignment1_26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String original;
        System.out.println("Enter a String : ");
        original= scan.next();
        boolean result = palidrome(original);
        if(result==true){
            System.out.println("String is palidrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
    static boolean palidrome(String original){
        char arr[] = original.toCharArray();
        int size = original.length();
        for(int i = 0 ; i < size/2;i++){
            if(arr[i]!=arr[size-i-1]){
                return false;
            }
        }
        return true;
    }
}
