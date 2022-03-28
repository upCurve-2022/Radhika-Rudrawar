package javaChallenges;

import java.util.Scanner;


public class Assignment3_2 {
    static final float pi= (float) 3.14;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radious : ");
        int r = scan.nextInt();

        System.out.println("Enter the height : ");
        int h = scan.nextInt();

        float area = pi*r*r*h;
        System.out.println("Volume of cylinder is : "+area);
    }
}
