import java.util.Scanner;

public class MultipleReturnValues {

    
    static double[] calculate(int[] numbers) {
        double[] result = new double[4];

        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        double average = (double) sum / numbers.length;

        result[0] = sum;
        result[1] = average;
        result[2] = max;
        result[3] = min;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        double[] output = calculate(numbers);

        System.out.println("\nSum = " + output[0]);
        System.out.println("Average = " + output[1]);
        System.out.println("Maximum = " + output[2]);
        System.out.println("Minimum = " + output[3]);

        sc.close();
    }
}