package String_Assignment;

import java.util.Scanner;

public class Assignment4_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = scan.nextLine();

        remove_hypen(str);

    }
    public static void remove_hypen(String str){

        for(int i = 0 ; i < str.length();i++){
            if(str.charAt(i)=='-'){
                if( (str.charAt(i-1)>='0' && str.charAt(i-1)<='9') &&
                        (str.charAt(i+1)>='0' && str.charAt(i+1)<='9')){
                    System.out.println(1);
                    str=str.replace(str.charAt(i),' ');
                }
            }
        }
        System.out.println(str);
    }
}
