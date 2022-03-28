package Assignment_No_1;

import java.util.Scanner;

//to find out largest and second largest number in 3 numbers
public class Assignment1_7 {
    public static void main(String[] args) {
        int first_number, second_number, third_number,largest_number ,second_largest;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        first_number = scan.nextInt();
        System.out.println("Enter Second Number : ");
        second_number = scan.nextInt();
        System.out.println("Enter Third Number : ");
        third_number = scan.nextInt();

        if(first_number>=second_number && first_number>=third_number){
            largest_number=first_number;
            if(second_number>=third_number){
                second_largest=second_number;
            }
            else{
                second_largest=third_number;
            }
        }
        else if(second_number>=first_number && second_number>=third_number ) {
            largest_number = second_number;
            if (first_number >= third_number) {
                second_largest = first_number;
            } else {
                second_largest = third_number;
            }
        }
        else{
            largest_number=third_number;
            if(first_number>=second_number){
                second_largest=first_number;
            }
            else{
                second_largest=second_number;
            }
        }
        System.out.println("Largest Number : "+largest_number);
        System.out.println("Second Largest Number : "+second_largest);
    }

}
