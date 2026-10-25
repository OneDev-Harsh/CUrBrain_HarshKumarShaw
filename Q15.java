import java.util.*;
public class Q15 {
    static int minAbs(int[] arr){
        int min=Integer.MAX_VALUE;
        int[] res = new int[2];
        res[0] = min;
        for(int i=0; i<arr.length; i++){
            if(Math.abs(arr[i])<res[0]){
                res[0]=Math.abs(arr[i]);
                res[1]=arr[i];
            }
        }
        return res[1];
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
        int res=minAbs(arr);
        System.out.println(res);
    }
}
