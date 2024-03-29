package Practical13;
import java.text.DecimalFormat;
import java.util.Stack;

public class Interpreter {
     public static void main(String[] args) {
        String expression = "4.3 25 + 1.7 2 * - 3.2 /";
        ///Alternative Inputs
        String secondInput = "2.2 4 + 2.6 3 / * 3 +";
        String thirdInput = "1.1 2 * 3.1 2 * 2 +";
        evaluatePostfix(expression); //input passed to evaluatePostfix
    }

    /// Method to evaluate a postfix expression
    public static void evaluatePostfix(String expression) {
    // Stack to store operands during evaluation
    Stack<Double> stack = new Stack<>();
    // Split expression into tokens
    String[] tokens = expression.split(" ");
    /// Decimal format to round final result to two decimal places
    DecimalFormat df = new DecimalFormat("#.##");

    /// Iterate through each token in the expression
    for (String token : tokens) {
         if (isOperator(token)) {
         // Make sure there are enough operands for the operator
         if (stack.size() < 2) {
          System.out.println("Invalid expression: Not enough operands for the operator " + token);
         }
        /// Pop the last two operands from the stack
        double operand2 = stack.pop();
        double operand1 = stack.pop();
        // Apply the operator to the operands
        double result = applyOperator(operand1, operand2, token);
        // Push the result back to the stack
        stack.push(result);
        // Print the applied operator and the current stack content
        System.out.println("Applied " + token + ", Stack: " + stack);
        } else {
            try {
           // Check if the token is a valid operand
           double operand = Double.parseDouble(token);
            // Push the operand to the stack
           stack.push(operand);
           // Print the pushed operand and the current stack content
           System.out.println("Pushed " + operand + ", Stack: " + stack);
           } catch (NumberFormatException e) {
           // Print error if the token is neither an operator nor a valid operand
           System.out.println("Invalid token: " + token);
        }
    }
}     
            /// Check the final stack contains exactly one result
            if (stack.size() == 1) {
                // If there's only one element in the stack, it's the final result
                double finalResult = stack.peek();
                //// Round the final result to two decimal places
                finalResult = Double.parseDouble(df.format(finalResult));
                System.out.println("Final result: " + finalResult);
            } else {
                // Print error if there are more operands than operators in the expression
                System.out.println("Invalid expression: More operands than operators");
         }
    }
    /// Method to check if the token is an operator
    public static boolean isOperator(String token) {
     return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
}
    // Method to apply an operator to two operands
    public static double applyOperator(double operand1, double operand2, String operator) {
     switch (operator) {
     case "+":
         return operand1 + operand2;
     case "-":
         return operand1 - operand2;
     case "*":
         return operand1 * operand2;
     case "/":
     if (operand2 != 0) {
         return operand1 / operand2;
     } else {
         throw new ArithmeticException("Division by zero");
     }
     default:
     /// Exception for an unknown operator
     throw new IllegalArgumentException("Invalid operator: " + operator);
     }
   }
}

