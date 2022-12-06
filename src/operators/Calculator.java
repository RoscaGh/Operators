package operators;
import java.util.Scanner;
public class Calculator {
    public Calculator() {
    }
    private static double read_arg(String msg){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
       while(true) {
           System.out.print(msg);
           String n = myObj.nextLine();
           try {
               double res = Double.parseDouble(n);
               return res;

           } catch (Exception e) {
               System.out.println("Introduceti un numar intreg sau fractionar");
           }
       }
    }
    public static void main() {

        double n1=read_arg("Introduceti primul argument a=");
        double n2=read_arg("Introduceti al doilea argument b=");

    }
}
