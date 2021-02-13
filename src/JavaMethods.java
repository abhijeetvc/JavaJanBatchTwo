// Methods: It is a block.
//It consists of: Access modifier, return type, method name, parameters, body, return statement

import java.util.Scanner;

public class JavaMethods {

    int a,b;

    public JavaMethods(int a,int b){
        this.a=a;   // this is a keyword in java. It is used to refer to current object.
        this.b=b;
    }

    void display(int... values){
        System.out.println("In display method");
    }

    int add(){
        //this.display();
        return a+b;
    }

    int sub(){
        return a-b;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a=sc.nextInt();
        System.out.println("Enter value for b: ");
        int b=sc.nextInt();
        JavaMethods j=new JavaMethods(a,b);
        j.display();
        int result=j.add();
        int result1=j.sub();
        System.out.println("Result: "+result);
    }
}
