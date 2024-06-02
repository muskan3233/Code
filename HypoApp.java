import java.util.Scanner;

public class HypoApp{
    public static void main(String args[]){
        double x;
        double y;
        double z;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        x = sc.nextDouble();
        System.out.println("Enter the value of y");
        y = sc.nextDouble();

        z = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

        System.out.println("The value of z is " + z);

        sc.close();
    }
}