package Assignment_No_1;

import java.util.Scanner;

public class Assignment1_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer number=0 ,fact=0;
        System.out.println("Enter a number to convert decimal into binary : ");
        number = scan.nextInt();

        int res = binarytodecimal(number);
        System.out.println("Decimal Number : "+res);
    }
    public static int binarytodecimal(int binary){
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }
}
