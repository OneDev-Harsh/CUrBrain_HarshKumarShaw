import java.util.*;
public class Q16 {
    static int silver(int[] arr){
        int l1=-1;
        int l2=-1;
        for(int i=0; i<arr.length; i++){
            if (arr[i] > l1) {
                l2 = l1;
                l1 = arr[i];
            } else if (arr[i]<l1 && arr[i]>l2) {
                l2 = arr[i];
            }
        }
        return l2;
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
        int res=silver(arr);
        System.out.println(res);
    }
}
