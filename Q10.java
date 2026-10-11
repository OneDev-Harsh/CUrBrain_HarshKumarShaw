import java.util.*;
public class Q10 {
    static int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean prime[] = new boolean[n];
        Arrays.fill(prime, true);

        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i * i < n; i++) {
            if (prime[i]) {
                for (int j = i * i; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (prime[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int res = countPrimes(n);
        System.out.println(res);
    }
}