package Assignment_No_1;

import java.util.Scanner;

public class Assignment1_24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num,pow,product=1;
        System.out.println("Enter a Number : ");
        num=scan.nextInt();
        System.out.println("Enter a power : ");
        pow=scan.nextInt();

        for(int i = 1;i<=pow;i++){
            product=product*num;
        }
        System.out.println(num + " to the power " + pow +" is : "+product);
    }
}
