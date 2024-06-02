import java.util.Scanner;

class Ptrn1{

    void print(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Ptrn1 obj = new Ptrn1();
        obj.print(n);
        }
    
}