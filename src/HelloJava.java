// Variable: Storage area in memory
// Types: a) Instance, b) Local, c) Class/static , d) Parameters

import java.util.Scanner;

public class HelloJava {
     int x=20;   // instance variable
     static int y=30;  // Class/static variable
     public static void main(String[] args) {
         int a=10;   //Local variable
        System.out.println("Value of a: "+a);
        HelloJava h=new HelloJava();
        System.out.println("Value of x: "+h.x);
        System.out.println("Value of y: "+y);

         Scanner sc=new Scanner(System.in);
         System.out.println("Enter num1: ");
        int num1=sc.nextInt();
         System.out.println("Enter num2: ");
        int num2=sc.nextInt();
        int total=num1+num2;
        System.out.println("Total : "+total);
    }
}
