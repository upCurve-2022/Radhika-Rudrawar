package javaChallenges;

import java.util.Scanner;

public class Assignment3_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int n = scan.nextInt();
        boolean check = checkSquare(n);
        if(check==true){
            System.out.println("Given number is perfect square . ");
        }
        else{
            System.out.println("Given number is not perfect square . ");
        }
    }
    static boolean checkSquare(int number){
        double sqrt = Math.sqrt(number);
        if(!(sqrt-Math.floor(sqrt)==0))
            return false;
        return true;
    }
}
