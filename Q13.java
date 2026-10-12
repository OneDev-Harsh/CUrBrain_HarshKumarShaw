import java.util.*;
public class Q13 {
    static boolean hasPrefixDivisibleByK(int[] arr, int k) {
        long sum = 0;
        int mod = Math.abs(k);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum % mod == 0) {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array: ");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        boolean res=hasPrefixDivisibleByK(arr,k);
        System.out.println(res);
    }
}
