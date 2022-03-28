package Assignment_No_1;//nahi aal
import java.util.Scanner;

public class Assignment1_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number , reverse_number;
        System.out.println("Enter a Number : ");
        number = scan.nextInt();

        System.out.println("Given Number : "+number);
        reverse_number = reverseNumber(number);
        System.out.println("Reverse Number : "+ reverse_number);

    }
        static int reverseNumber(int number){
        int reverse_Number=0 ,rem=0;
        while(number>0){
            rem=number%10;
            reverse_Number= reverse_Number*10 + rem;
            number=number/10;

        }
        return reverse_Number;
    }
}
