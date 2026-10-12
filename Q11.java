import java.util.*;
public class Q11 {
    static int sumArray(int[] arr) {
        long MOD = 1000000007L;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = (sum + arr[i]) % MOD;
        }
        return (int) sum;
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
        int res=sumArray(arr);
        System.out.println(res);
    }
}