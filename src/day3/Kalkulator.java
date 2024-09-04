package day3;

public class Kalkulator {
    public double hitung(char operator, double bilangan1, double bilangan2) {
        switch (operator) {
            case '+':
                return bilangan1 + bilangan2;
            case '-':
                return bilangan1 - bilangan2;
            case '*':
                return bilangan1 * bilangan2;
            case '/':
                if (bilangan2 == 0) {
                    throw new ArithmeticException("Pembagian dengan nol tidak dapat dilakukan");
                }
                return bilangan1 / bilangan2;
            default:
                throw new IllegalArgumentException("Operator tidak valid");
        }
    }
}
