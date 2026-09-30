public class PerfectNumber {
    public static void main(String[] args) {
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);

        for (int n = start; n <= end; n++) {
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0)
                    sum = sum + i;
            }
            if (sum == n && n > 0)
                System.out.println(n);
        }
    }
}

