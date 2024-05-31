package lab7asngmnts;
import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
        double num10, num5, result;
        
        char operator;
        System.out.print("Enter first number: ");
        num10 = input.nextDouble();
        
        System.out.print("Enter second number: ");
        num5 = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        operator = input.next().charAt(0);
      
        if (operator == '+') {
            result = num10 + num5;
        } else if (operator == '-') {
            result = num10 - num5;
        } else if (operator == '*') {
            result = num10 * num5;
        } else if (operator == '/') {
            if (num5 != 0) {
                result = num10 / num5;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                return;
            }
        } else {
            System.out.println("Error: Invalid operator.");
            return;
        }

        System.out.println("Result: " + result);
	}
	

}
