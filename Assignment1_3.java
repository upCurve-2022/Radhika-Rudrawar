package Assignment_No_1;//to calculate simple interest
import java.util.Scanner;

public class Assignment1_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int principle_amount , rate , time ;
        float simple_interest ;
        System.out.println("Enter principle amount : ");
        principle_amount = scan.nextInt();
        System.out.println("Enter rate : ");
        rate = scan.nextInt();
        System.out.println("Enter time period in year : ");
        time = scan.nextInt();

        //calculating simple interest
        simple_interest = (principle_amount*rate*time)/100;
        System.out.println("Simple Interest is : "+simple_interest);
    }
}
