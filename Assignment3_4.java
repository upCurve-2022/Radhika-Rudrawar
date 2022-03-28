package javaChallenges;

import java.util.Scanner;

public class Assignment3_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char low='A' , high = 'Z';
        while(low<=high){
            System.out.println(low +" "+(int)low+" ");
            low++;
        }
        char low1='a' , high1 = 'z';
        while(low1<=high1){
            System.out.println(low1 +" "+(int)low1+" ");
            low1++;
        }
    }
}
