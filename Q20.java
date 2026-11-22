import java.util.*;
public class Q20 {
    static void runningSuffixSum(int[] arr) {
        long sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            int cur = arr[i];
            arr[i] = (int) sum;
            sum += cur;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements in the array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        runningSuffixSum(arr);

        System.out.println("Array after running suffix sum:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
