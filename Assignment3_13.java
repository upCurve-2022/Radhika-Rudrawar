package javaChallenges;

import java.util.Scanner;

public class Assignment3_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count ;
        System.out.println("Enter a String : ");
        String str = scan.nextLine();

        count = wordCount(str);
        System.out.println("Number of words in string is : "+count);
    }
    public static int wordCount(String str){
        int count=1;
        for(int i = 0 ; i < str.length()-1;i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!= ' '){
                count++;
            }
        }
        return count;
    }
}
