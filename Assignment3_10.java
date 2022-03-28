package javaChallenges;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Assignment3_10 {

    public static void copyFile(File file1,File file2) throws Exception {


            FileInputStream a = new FileInputStream(file1);
            FileOutputStream b = new FileOutputStream(file2,true);
        try{
            int n ;
            while((n=a.read())!= -1){
                b.write(n);
            }
        }
        finally{
            if(a != null){
                a.close();
            }
            if(b!=null){
                b.close();
            }
            System.out.println("File copied .");
        }

    }
    public static void main(String[] args) throws Exception{

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the file which we have to copy in another file : ");
        String str_file1 = scan.nextLine();

        System.out.println("Enter the file in which you want to copy the data :");
        String str_file2 = scan.nextLine();

        File file1 = new File(str_file1);
        File file2 = new File(str_file2);


        copyFile(file1,file2);

    }
}
