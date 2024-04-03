package challenges;

import java.util.Scanner;

//perimeter of rectangle
public class rectangle {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome here to find the perimeter of rectangle");
        System.out.println("Enter the sidea of rectangle");
        double sidea= input.nextDouble();
        System.out.println("Enter the sideb of rectangle");
        double sideb= input.nextDouble();
        System.out.println("Enter the sidec of rectangle");
        double sidecc= input.nextDouble();
        System.out.println("Enter the sided of rectangle");
        double sided= input.nextDouble();
        double perimeter =(sidea+sideb+sidecc+sided);
        System.out.println("Perimeter of the rectangle is " + perimeter);
        System.out.println("Thanks for your Sincere contribution in this calculator");

    }
}
