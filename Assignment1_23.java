package Assignment_No_1;

import java.util.Scanner;

public class Assignment1_23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        int arr[] = new int[20];
        int brr[] = new int[20];
        arr[0] = 1;
        brr[0] = -2;
        int operator1=1,operator2=-2;
        for(int i = 1 ; i< arr.length;i++){
            operator1 += 3;
            arr[i] = operator1;
        }
        for(int j = 1 ; j < brr.length;j++){
            operator2 -= 4;
            brr[j]= operator2;
        }
        for(int i = 0 ; i < arr.length ; i++ ){
            System.out.print(arr[i]+" "+brr[i]+" ");
        }
    }
}
