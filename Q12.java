import java.util.*;
public class Q12 {
    static int modularPower(int base, int power, int MOD) {
        int result = 1 % MOD;
        for (int i = 0; i < power; i++) {
            result = (result * base) % MOD;
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        System.out.print("Enter the mod: ");
        int mod = sc.nextInt();
        int res=modularPower(base, power, mod);
        System.out.println(res);
    }
}