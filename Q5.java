import java.util.*;
public class Q5 {
    static void replace(int n, Stack<Integer> res){
        while(n!=0){
            int num = n%10;
            res.push(num%2==0?0:num);
            n/=10;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        Stack<Integer> res = new Stack<>();
        replace(n, res);
        while(!res.isEmpty()){
            System.out.print(res.pop());
        }
    }
}
