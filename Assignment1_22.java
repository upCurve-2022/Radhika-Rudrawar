package Assignment_No_1;

import java.util.Scanner;

public class Assignment1_22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[] = new int[30];
        arr[0] = 0 ;
        arr[1]=1;

        for(int i =1;i< arr.length-1;i++){
            arr[i+1] = arr[i] + arr[i-1];
        }
        for(int i =1 ;i< arr.length-1;i++){
            System.out.print(arr[i]+" ");

        }
    }
}
