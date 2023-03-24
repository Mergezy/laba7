public class Main {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        double result1 = calc1.calculateExpression1(2.0);

        Calculator calc2 = new Calculator();
        double result2 = calc2.calculateExpression2(3.0, 1.0);

        Calculator calc3 = new Calculator();
        double result3 = calc3.calculateExpression3(2.0, 1.0, 4.0);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
    }
    public static class Calculator {
        public double calculateExpression1(double x) {
            double y = 3 * x + 5;
            return y;
        }

        public double calculateExpression2(double a, double b) {
            double y = (a + b) / (a - b);
            return y;
        }

        public double calculateExpression3(double a, double b, double x) {
            double y = Math.pow(a * x / b, a * x / b);
            return y;
        }
    }
}
