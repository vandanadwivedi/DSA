import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int num = sc.nextInt();

        int[] arr = new int[num];

  
        System.out.println("Enter " + num + " elements:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];  

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest number: " + largest);
    }
}
