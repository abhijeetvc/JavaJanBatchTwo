import java.util.Scanner;

public class ConditionalStatements {

    public static void main(String[] args) {
        int marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks: ");

        marks=sc.nextInt();
        if(marks>=80){
            System.out.println("Grade A");
        }else if(marks>=70){
            System.out.println("Grade B");
        }else if(marks>=50){
            System.out.println("Grade C");
        }else{
            System.out.println("Grade D");
        }

    }
}
