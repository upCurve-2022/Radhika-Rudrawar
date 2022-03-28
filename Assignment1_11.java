package Assignment_No_1;

import java.util.Scanner;

public class Assignment1_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Displaying the numbers");
        System.out.println("Enter the highest number of displaying the numbers : ");
        int n = scan.nextInt();
        display(n);
    }
    static void display(int n){
        for(int i =1 ; i<=n;i++){
            if(i%2==0){
                System.out.print((int)Math.pow(i,2)+" ");
            }
        }
    }
}
