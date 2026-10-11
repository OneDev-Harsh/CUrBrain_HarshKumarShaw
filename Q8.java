import java.util.*;
public class Q8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number (n): ");
        int n = sc.nextInt();

        System.out.print("Enter the Number (k): ");
        int k = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i=1; i*i<=n; i++){
            if(n%i==0) {
                list.add(i);
                if(i!=n/i) list.add(n/i);
            }
        }

        Collections.sort(list);
        if(list.size()<k) System.out.println(-1);
        else System.out.println(list.get(k-1));
    }
}
