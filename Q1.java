import java.util.*;
class Q1 {
    static boolean hasEvenDigits(int n) {
        n = Math.abs(n);
        int count = 0;

        do {
            count++;
            n /= 10;
        } while (n > 0);

        return count % 2 == 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(hasEvenDigits(n)) System.out.println("True");
        else System.out.println("False");
    }
}