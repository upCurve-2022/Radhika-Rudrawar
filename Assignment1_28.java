package Assignment_No_1;

import java.util.Scanner;

public class Assignment1_28 {
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
        boolean res = search(arr,n);
        if(res==true){
            System.out.println("Number is present in array");
        }
        else{
            System.out.println("Number is not present in array");
        }
    }

    static boolean search(int[] arr , int number){

        boolean res;
        for(int i = 0 ; i< arr.length;i++){
            if(arr[i]==number){
                return true;
            }
        }
        return false;
    }
}
