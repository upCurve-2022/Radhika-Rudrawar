package Exception_Handling;

import java.util.Scanner;

class CustomException extends RuntimeException {
    public CustomException(String error_) {
        super(error_);

    }
    public CustomException(){
        super("Delivery is not available at your zipcode....!!!!");
    }
}
public class Handling_Exception extends CustomException {


    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter zip code : ");
        String str = scan.nextLine();
        try{

            if ((str.contentEquals("123")) ||
                    (str.contentEquals("456") ) ||
                    (str.contentEquals("789")) ){
                throw new CustomException("Delivery is not available at your zipcode....!!!!");
            }
            else if(str==" "){
                System.out.println("please enter zip code!!!!");
            }
            else{
                System.out.println("“Delivery available\n" +
                        "in your area! ");
            }
        }
        catch(CustomException e){
            System.out.println("Delivery is not  available in your area!");
            System.out.println("Please enter correct zip code!!!");
        }
        finally{
            System.out.println("Please visit again!!!!");
        }
    }
}
