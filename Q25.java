import java.util.*;
public class Q25 {
    static int[] closestPair(int[] temps, int target) {
        int left = 0;
        int right = temps.length - 1;
        int bestL = 0;
        int bestR = temps.length - 1;
        int bestDiff = Math.abs(temps[0] + temps[temps.length - 1] - target);

        while (left < right) {
            int sum = temps[left] + temps[right];
            int diff = Math.abs(sum - target);

            if (diff < bestDiff) {
                bestDiff = diff;
                bestL = left;
                bestR = right;
            }

            if (sum < target) left++;
            else right--;
        }
        return new int[]{temps[bestL], temps[bestR]};
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();

        System.out.println("Enter the temperatures in ascending order: ");
        int temps[] = new int[n];
        for (int i = 0; i < n; i++) {
            temps[i] = sc.nextInt();
        }

        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        int res[] = closestPair(temps, target);
        System.out.println("(" + res[0] + ", " + res[1] + ")");
    }
}
