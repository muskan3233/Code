import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcpHandling {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a number to divide by: ");
            int y = scanner.nextInt();

            int z = x/y;
            System.out.println("result: " + z);
        }
        catch(ArithmeticException ar){
            System.out.println("IDIOT! you can't divide by 0");
        }
        catch(InputMismatchException im){
            System.out.println("You can only enter numbers YOU DONKEY!!!");
        }
        catch(Exception e){
            System.out.println(" OOPS!! Something went wrong");
            System.out.println("e.getMessage");
        }
        finally{
            System.out.println("Thank You!");
            System.out.println("Good Bye!");
            
        }
    }
}
