package challenges;
//calculate the product of two floatiing points numbers

import java.util.Scanner;

public class floatpnt {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("here we see the multiplication of two float products");
        System.out.println("Please enter first  decimal number :");
        double first = input.nextDouble();
        System.out.println("please enter the second number");
        double second= input.nextDouble();
        double mult= first*second;
        System.out.println("\n Result is : " +mult);

    }
}
