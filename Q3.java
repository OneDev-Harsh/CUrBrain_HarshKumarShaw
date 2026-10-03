import java.util.*;
class Q3 {
    static int palin(int n){
        int rev=0;
        while(n!=0){
            rev=(rev*10)+(n%10);
            n/=10;
        }
        return rev;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int res = palin(n);
        if(res==n && n>=0) System.out.println(n);
        else System.out.println(n+res);
    }
}