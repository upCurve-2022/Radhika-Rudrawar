package Assignment_No_1;//nahi aal

import java.util.Scanner;

public class Assignment1_16 {
    static int a=1 ;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Displaying the numbers");
        System.out.println("Enter the highest number of displaying the numbers : ");
        int n = scan.nextInt();
        display(n);
    }
    static void display(int number){

        int brr[] = new int[number];
        int arr[] = new int[number];
        int n= 1,temp=4;
        brr[0]=1;
        for(int i = 0 ; i < number ; i++){

            if(i%2==1){

                arr[i]=temp;
                temp+=8;

            }
            else{

                arr[i]=temp;
                temp+=4;

            }
        }
        for(int i = 0 ; i< arr.length-1;i++){
            System.out.print(brr[i]+" ");
            brr[i+1]=arr[i]+brr[i];
        }
    }
}
