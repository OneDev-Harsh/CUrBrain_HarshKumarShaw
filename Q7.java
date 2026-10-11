import java.util.*;
public class Q7 {
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int arrayGCD(int arr[], int n) {
        int res = arr[0];
        for (int i = 1; i < n; i++) {
            res = gcd(res, arr[i]);
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = arrayGCD(arr, n);
        System.out.println("GCD of the array: " + res);
    }
}