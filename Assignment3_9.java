package javaChallenges;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Assignment3_9 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the file name : ");
            String filename = scan.nextLine();
            String path = "D:\\Target\\" +filename+".txt";

            FileOutputStream file = new FileOutputStream(path, true);
            System.out.println(file);
            System.out.println("Enter the line : ");
            String str = scan.nextLine();

            byte[] arr = str.getBytes();
            file.write(arr);
            file.close();

            System.out.println("File closed .");

        }
        catch(Exception e){
            e.printStackTrace();
        }


    }
}
