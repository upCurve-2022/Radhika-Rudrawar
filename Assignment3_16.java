package javaChallenges;

import java.util.Scanner;

public class Assignment3_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = scan.nextLine();

        char[] crr = str.toCharArray();

        for(int i = 0 ; i < crr.length;i++){
            for(int j=i+1;j<crr.length;j++){
                if(crr[i]==crr[j]){
                    System.out.println( crr[j] + " ");
                    break;
                }
            }
        }
    }
}
