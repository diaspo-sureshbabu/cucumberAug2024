package javabasics;
import java.util.Scanner;

public class OperatorsClass {
    public static void main(String[] args) {
        int a =200, b=100;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String yesorno;
        do {
            System.out.println("Enter the operator here");
            String operator = myObj.nextLine();  // Read user input
            System.out.println("operator is: " + operator);  // Output user input
            if (operator.equals("+")) {
                System.out.println(a + b);
            } else if (operator.equals("*")) {
                System.out.println(a * b);
            } else if (operator.equals("/")) {
                System.out.println(a / b);
            } else if (operator.equals("-")) {
                System.out.println(a - b);
            }
            System.out.println("Do you want to continue(y/n)...");
            yesorno = myObj.nextLine();
            // Read user input
            //System.out.println("operator is: " + operator);  // Output user input
        }while(yesorno.equals("y"));

    }
}
