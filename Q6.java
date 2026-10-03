import java.util.*;
public class Q6 {
    static int freq(int n, int a, int b){
        int ac=0;
        int bc=0;
        while(n!=0){
            if(a==n%10) ac++;
            if(b==n%10) bc++;
            n/=10;
        }
        return ac-bc;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter 'a' : ");
        int a = sc.nextInt();
        System.out.print("Enter 'b' : ");
        int b = sc.nextInt();
        int res = freq(n,a,b);
        System.out.println(res);
    }
}
