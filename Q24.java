import java.util.*;
public class Q24 {
    static int shortestSubarray(int[] arr, int target) {
        int minLen = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum >= target) {
                    int len = j - i + 1;
                    if (minLen == 0 || len < minLen) minLen = len;
                    break;
                }
            }
        }
        return minLen;
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

        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        System.out.println("Length of shortest subarray: " + shortestSubarray(arr, target));
    }
}
