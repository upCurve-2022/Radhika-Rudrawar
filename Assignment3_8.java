package javaChallenges;

import java.io.File;
import java.io.IOException;


public class Assignment3_8 {
    public static void main(String[] args) {
        File file = new File("D:\\Target\\demo.txt");
        boolean result ;
        try{
            result = file.createNewFile();
            if(result==true){
                System.out.println("File created at : "+ file.getCanonicalPath());
            }
            else{
                System.out.println("File already existed at : "+file.getCanonicalPath());
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
