package challenges;

import java.util.Scanner;

public class arithmeticopts {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("welcome to arithematic  calculator");
        System.out.println(" please Enter the first number");
        int first=input.nextInt();
        System.out.println("please enter the second number");
        int second=input.nextInt();
        int add=first+second;
        int sub=first-second;
        int mul=first*second;
        int div=first/second;
        int mod=first%second;

        System.out.println("Additon valuee is : " +add);
        System.out.println("subtraction valuee is : " +sub);
        System.out.println("multiplication valuee is : " +mul);
        System.out.println("division valuee is : " +div);
        System.out.println("modulas valuee is : " +mod);


        System.out.println("sincere thanks for valuable  time");




    }
}
