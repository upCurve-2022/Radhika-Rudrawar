package Assignment_No_1;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment1_29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[] = new int[10];
        int n;
        for(int i = 0 ; i < arr.length;i++){
            System.out.println("Enter the "+i+ " element :");
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter a number to be search : ");
        n = scan.nextInt();

        int result = Arrays.binarySearch(arr,n);
        if(result<0){
            System.out.println("Element is not found!!");
        }
        else{
            System.out.println("Element is found at position : "+result);
        }

    }
}
