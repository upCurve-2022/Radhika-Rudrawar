package Assignment_No_1;

import java.util.Scanner;

public class Assignment1_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Displaying the numbers");
        System.out.println("Enter the lowest number of displaying the numbers : ");
        int m = scan.nextInt();
        System.out.println("Enter the highest number of displaying the numbers : ");
        int n = scan.nextInt();
        for(int i = m;i<=n;i++){
           boolean result =  display(i);
           if(result==true){
               System.out.print(i+" ");
           }
        }

    }
    public static boolean display(int  n){

        boolean result;
        if(n==0 || n==1) {
           return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }
}
