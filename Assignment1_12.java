package Assignment_No_1;

import java.util.Scanner;

public class Assignment1_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Displaying the numbers");
        System.out.println("Enter the highest number of displaying the numbers : ");
        int n = scan.nextInt();
        display(n);
    }
    static void display(int number){
        int arr[] = new int[number/2];
        int brr[] = new int[number/2];
        int a=-1,b=2;
        for(int i = 0 ; i <arr.length;i++){
            arr[i] = a;
            a -= 2;
        }
        for(int i = 0 ; i <brr.length;i++){
            brr[i] = b;
            b +=2;
        }
        for(int i = 0 ; i < arr.length;i++){
            System.out.print(arr[i]+" "+brr[i]+" ");
        }
    }
}
