package Assignment_No_1;

import java.util.Scanner;

public class Assignment1_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Displaying the numbers");
        System.out.println("Enter the highest number of displaying the numbers : ");
        int n = scan.nextInt();
        display(n);
    }
    static void display(int number){
        for(int i = 1 ; i <number;i++){
            System.out.print((int)Math.pow(i,i)+" ");
        }
    }
}
