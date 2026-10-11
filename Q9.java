import java.util.*;
public class Q9 {

    static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2; i*i<=n; i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        while(true){
            if(isPrime(++n)){
                System.out.println(n);
                break;
            }
        }
    }
}
