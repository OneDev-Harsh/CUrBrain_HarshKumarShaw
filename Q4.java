import java.util.*;
public class Q4 {
    static void prodsum(int n, int res[]){
        int prod=1;
        int sum=0;
        while(n!=0){
            prod*=n%10;
            sum+=n%10;
            n/=10;
        }
        res[0] = prod;
        res[1] = sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int res[] = new int[2];
        prodsum(n, res);
        System.out.println(res[0]-res[1]);
    }
}
