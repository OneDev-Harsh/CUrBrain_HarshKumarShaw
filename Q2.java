import java.util.*;
class Q2 {
    static int revDouble(int n){
        int rev=0;
        while(n!=0){
            rev=(rev*10)+(n%10);
            n/=10;
        }
        return rev*2;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int res = revDouble(n);
        System.out.print("Reversed and Doubled: "+res);
    }
}
