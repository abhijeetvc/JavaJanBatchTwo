import java.util.Scanner;

public class SwitchPrg {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1: ");
        int no1=sc.nextInt();
        System.out.println("Enter number2: ");
        int no2=sc.nextInt();
        System.out.println("Enter choice: 1. ADD, 2. SUB, 3. MUL, 4. DIV ");
        int choice=sc.nextInt();
        int result;
        switch (choice){
            case 1:
                result=no1+no2;
                System.out.println("Addition: "+result);
                break;

            case 2:
                result=no1-no2;
                System.out.println("Subtraction: "+result);
                break;

            case 3:
                result=no1*no2;
                System.out.println("Multiplication: "+result);
                break;

            case 4:
                result=no1/no2;
                System.out.println("Division: "+result);
                break;

            default:
                System.out.println("Incorrect choice...");
                break;
        }

    }
}
