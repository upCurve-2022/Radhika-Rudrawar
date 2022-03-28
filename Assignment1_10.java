package Assignment_No_1;

import java.util.Scanner;

public class Assignment1_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number ;
        System.out.println("Enter a number : ");
        number = scan.nextInt();

        display(number);
    }

    static void display(int number){
        int k = 0 ,rem1=0,number1=number;
        while(number1>0){
            rem1=number1%10;
            k++;
            number1=number1/10;
        }
        int rem=0,j=0;
        String[] digits = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] arr = new String[k];
        while(number>0){
            rem=number%10;
            arr[j] = digits[rem];
            j++;
            number = number/10;
        }
        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
