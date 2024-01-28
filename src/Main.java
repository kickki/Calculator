public class Main {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        Calculator calculator = new Calculator(logger);

        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(1, -2);

        ComplexNumber sum = calculator.add(num1, num2);
        ComplexNumber product = calculator.multiply(num1, num2);
        ComplexNumber quotient = calculator.divide(num1, num2);

        logger.log("Sum: " + formatComplexNumber(sum));
        logger.log("Product: " + formatComplexNumber(product));
        logger.log("Quotient: " + formatComplexNumber(quotient));
    }

    private static String formatComplexNumber(ComplexNumber number) {
        String realPart = String.format("%.2f", number.getReal());
        String imaginaryPart = String.format("%.2f", number.getImaginary());
        return realPart + " + " + imaginaryPart + "i";
    }

//        ComplexNumber num1 = new ComplexNumber(2, 3);
//        ComplexNumber num2 = new ComplexNumber(1, -2);
//
//        ComplexNumber sum = calculator.add(num1, num2);
//        ComplexNumber product = calculator.multiply(num1, num2);
//        ComplexNumber quotient = calculator.divide(num1, num2);

}