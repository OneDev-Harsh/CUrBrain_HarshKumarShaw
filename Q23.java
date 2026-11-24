import java.util.*;
public class Q23 {
    static int minSubArraySum(int[] arr) {
        int minSum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum < minSum) minSum = sum;
            }
        }
        return minSum;
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

        System.out.println("Minimum subarray sum: " + minSubArraySum(arr));
    }
}
