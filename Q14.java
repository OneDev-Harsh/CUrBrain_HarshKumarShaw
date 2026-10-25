import java.util.*;
public class Q14 {
    static List salesThreshold(List<Integer> sales, int t){
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<sales.size(); i++){
            if(sales.get(i)>=t) res.add(sales.get(i));
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of sales array: ");
        int n = sc.nextInt();
        System.out.println("Enter the sales: ");
        List<Integer> sales = new ArrayList<>();
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            sales.add(x);
        }
        System.out.print("Enter the value of threshold: ");
        int t = sc.nextInt();
        System.out.println(salesThreshold(sales,t));
    }
}
