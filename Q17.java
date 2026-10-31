import java.util.*;
public class Q17 {
    static int popular(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        int maxFreq = 0;
        int res = Integer.MAX_VALUE;

        for (int key : freq.keySet()) {
            int count = freq.get(key);

            if (count > maxFreq) {
                maxFreq = count;
                res = key;
            } else if (count == maxFreq && key < res) {
                res = key;
            }
        }

        return res;
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

        int res = popular(arr);
        System.out.println(res);
    }
}