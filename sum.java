import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Calculator");
        System.out.println("Please enter first number");
        int a=input.nextInt();
        System.out.println("Now Please enter the second number:");
        int b= input.nextInt();
        int sum= a+b;
        System.out.println("Our Calculation result is: " +sum);


    }
}
