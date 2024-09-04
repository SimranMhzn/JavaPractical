
import java.util.*;

public class Print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int i=sc.nextInt();
        try{
            if(i<=0){
                hey(i);
            }
        }
        catch(myException e) {
            System.out.println("Error found in the program!");
        }
        finally{
            System.out.println("I am always executed!");
        }
    }

    static void hey(int b ){
        throw new myException("Error");
    }
}

class myException extends RuntimeException{
    myException(String msg){

        super(msg);
    }

}

