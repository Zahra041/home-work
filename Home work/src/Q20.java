public class Q20 {
    public class Main {
        public static void main(String[] args) {
            int n = 10;
            int sum = 0;
            for (int i = 1; i <= n; i += 2) {
                sum += i;
            }
            System.out.println("The sum of all odd positive integers less than or equal to " + n + " is " + sum);
        }
    }
}
