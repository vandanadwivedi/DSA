import java.util.Scanner;

public class PoweExponentiation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number (x): ");
        int x = sc.nextInt();

        System.out.print("Enter the power (n): ");
        int n = sc.nextInt();

        int ans = 1;

        while (n > 0) {
            if (n % 2 == 1) { 
                ans = ans * x;
                n = n - 1;
            } else {
                x = x * x;
                n = n / 2;
            }
        }

        System.out.println("Answer = " + ans);
        sc.close();
    }
    
}
