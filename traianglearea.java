package challenges;

import java.util.Scanner;

public class traianglearea {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the base of triangle");
        double base= input.nextDouble();
        System.out.println("Enter the height the of the of triangle ");
        double height= input.nextDouble();
        double area = (base*height)/2;
        System.out.println("Area of the  Triangle is : " + area );
        System.out.println("Thanks for valuable response  in  this calculator");
    }
}
