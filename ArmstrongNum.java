import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        
        int num = sc.nextInt();
        int temp = num;
        int digit = 0;

        while (num > 0) {
            int rem = num % 10;
            digit = digit + (rem * rem * rem);
            num = num / 10;
        }

        if (temp == digit) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    sc.close();
    }
}
