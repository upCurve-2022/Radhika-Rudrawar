package javaChallenges;

import java.util.Scanner;

public class Assignment3_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];
        int sum=0;
        float avg;
        System.out.println("Enter the array elements as folow : ");
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the "+(i+1)+" element : ");
            arr[i] = scan.nextInt();
        }
        for(int i = 0 ; i<arr.length;i++){
            sum += arr[i];
        }
        avg = (float)sum/ arr.length;
        System.out.println("Average of array elements is : "+avg);
    }
}
