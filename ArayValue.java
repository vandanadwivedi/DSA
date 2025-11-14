import java.util.Scanner;
public class ArayValue {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int num= sc.nextInt();

          int[] arr = new int[num];

        System.out.println("Enter " + num + " elements:");
       
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
            }
     System.out.println("You entered:");
        for(int i = 0; i < num; i++){
            System.out.println(arr[i]);
        }
}
}