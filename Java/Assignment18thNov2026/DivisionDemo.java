public class DivisionDemo {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                System.out.println("Usage: java DivisionDemo <number1> <number2>");
                return;
            }

            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            int result = num1 / num2;
            System.out.println("Result of " + num1 + " / " + num2 + " = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Exception: Divisor cannot be zero. (" + e.getMessage() + ")");
        } catch (NumberFormatException e) {
            System.out.println("Exception: Please enter valid integer numbers.");
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}