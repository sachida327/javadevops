import java.util.Scanner;

public class user {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Name:");
        String name = input.nextLine();
        ;
        System.out.println("hii Dear " + name);
        System.out.println(name + ", Also tell me your age");
        int age = input.nextInt();
        System.out.println(name + " Your age is: " + age);
        System.out.println("Thanks for Your Information " + name);
    }
}
