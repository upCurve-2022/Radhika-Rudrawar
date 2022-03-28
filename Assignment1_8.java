package Assignment_No_1;

import java.util.Scanner;

//calculation of sum of odd and even numbers
public class Assignment1_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n , sum_odd=0 , sum_even=0;
        System.out.println("Enter a Number :");
        n = scan.nextInt();
        for(int i=0;i<=n;i++){
            if(i%2==0){
                sum_even = sum_even + i;
            }
            else{
                sum_odd=sum_odd+i;
            }
        }
        System.out.println("Sum of odd Numbers : "+sum_odd);
        System.out.println("Sum of even Numbers : "+sum_even);
    }
}
