package Assignment_No_1;

import java.util.Scanner;

public class Assignment1_25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String original;

        System.out.println("Enter a original string : ");
        original = scan.next();

        int size = original.length();
        char arr[] = original.toCharArray();
        char rev_arr[] = new char[100];

        for(int i = 0 ; i< size ; i++){
            rev_arr[i] = arr[size-i-1];
        }
        for(int i = 0 ; i<size;i++){
            System.out.print(rev_arr[i]);
        }
    }
}
