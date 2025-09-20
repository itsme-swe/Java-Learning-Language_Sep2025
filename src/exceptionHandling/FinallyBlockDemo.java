package exceptionHandling;

import java.util.Scanner;

public class FinallyBlockDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        try {
            if (a < 0 || b < 0) throw new Exception("Values cannot be negative!!");
            else {
                int c = a / b;
                System.out.println(c);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Program Ends...");
        }

    }
}
