package Assignment_No_1;

import java.util.Scanner;

public class Assignment1_19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number=0 ,fact=0;
        System.out.println("Enter a number to convert decimal into binary : ");
        number = scan.nextInt();

        decimaltobinary(number);

    }
    static void decimaltobinary(int number){
        int rem=0,i=0;
        int num[] = new int[100];
        while(number>0){
            rem = number%2;
            num[i] = rem;
            i++;
            number = number/2;

        }
        for(int j=i-1;j>=0;j--){
            System.out.print(num[j]);
        }
    }
}
