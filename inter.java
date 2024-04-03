import java.util.Scanner;

public class inter {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to swapping system");
        System.out.println("Enter value of A :");
        int a= input.nextInt();
        System.out.println("Enter  value of B :");
        int b = input.nextInt();
        int c = a ;
        a=b;
        b=c;
        System.out.println("Swapping is Done successfully");
        System.out.println(" Value of A is : " +a);
        System.out.println(" Value of B is : " +b);

    }
}
