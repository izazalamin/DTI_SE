package day3;

public class Calculator {
    public double count(char operator, double num1, double num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("dividing with 0 is invalid");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("invalid Operator");
        }
    }
}
