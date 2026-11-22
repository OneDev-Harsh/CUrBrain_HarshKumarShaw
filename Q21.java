import java.util.*;
public class Q21 {
    static int deleteValue(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                return arr.length - 1;
            }
        }
        return arr.length;
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

        System.out.print("Enter the target value: ");
        int target = sc.nextInt();

        int newLen = deleteValue(arr, target);

        System.out.println("Array after deletion:");
        for (int i = 0; i < newLen; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
