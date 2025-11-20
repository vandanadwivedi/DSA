import java.util.Scanner;
public class Calculater1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first value:");
        int a =sc.nextInt();

        System.out.println("Enter the Secong value:");
        int b =sc.nextInt();

        System.out.println("Press 1 for Sum Value");
        System.out.println("Press 2 for Subtract Value");
        System.out.println("Press 3 for Multiple Value");
        System.out.println("Press 4 for Divide Value");

         System.out.println("Enter the choice:");
        int choice =sc.nextInt();

       switch(choice) {

       case 1:
         int sum = a+b;
         System.out.println("Sum="+sum);
         break;

       case 2:
          int sub= a-b;
         System.out.println("Subtract="+sub);
         break;

       case 3:
         int multi=a*b;
         System.out.println("Multiply="+multi);
         break;
             
       case 4:
        
         int div=a/b;
         System.out.println("Divide="+div);
         break;





    }
}
}
