
import java.util.Scanner;

public class Plaindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = sc.nextInt();

        int Number = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if (Number  == reversed) {
            System.out.println(Number + " is palindrome number.");
        } else {
            System.out.println(Number  + " is not palindrome number.");
        }

        sc.close();
    }
}

    

