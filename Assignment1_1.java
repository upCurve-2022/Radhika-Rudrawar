package Assignment_No_1;//printing pattern 1
import java.util.Scanner;

public class Assignment1_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i , j ,n ;
        System.out.println("Enter a number :");
        n=scan.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
