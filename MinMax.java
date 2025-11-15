import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        int num = sc.nextInt();

        int arr[] = new int[num];

        System.out.println("Enter the array");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();  
        }

        int min = arr[0];
        int max = arr[0];

        System.out.println("Conditions");
        for (int i = 1; i < num; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum Value = " + min);
        System.out.println("Maximum Value = " + max);
    }
}
