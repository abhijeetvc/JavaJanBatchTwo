import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.*;
import java.util.stream.Collectors;

public class JavaEightInterfaces {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(10,15,5,20,25,30);
     //   list.forEach(value-> System.out.println(value));
        list.forEach(System.out::println);

        //Consumer Interface
//        Consumer<String> c=value-> System.out.println(value);
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter name: ");
//        String name=sc.next();
       // c.accept(name);

        //Function Interface
        Function<String,Integer> f1=str->str.length();
        Integer val1=f1.apply("Abhijeet");
        System.out.println("Length is: "+val1);

        //BiFunction Interface
        BiFunction<Integer,Integer,Integer> f2=(a,b)->a+b;
        Integer val2=f2.apply(10,20);
        System.out.println("Result: "+val2);

        //BinaryOperator
        BinaryOperator<Integer> f3=(a,b)->a+b;
        Integer val3=f3.apply(30,40);
        System.out.println("Bi Result: "+val3);

        //UnaryOperator
        UnaryOperator<Integer> f4=val->val*10;
        Integer val4=f4.apply(50);
        System.out.println("VAl4: "+val4);

        //Predicate
        Predicate<Integer> p=x->x>10;
        List<Integer> newList=list.stream().filter(p).collect(Collectors.toList());
        System.out.println("New List: "+newList);

        //assignment
        List<String> strList=Arrays.asList("a","b","c","d");

        BiPredicate<String,Integer> f5=(str,val)->{
            return str.length()==val;
        };
        boolean flag=f5.test("Abhi",5);
        System.out.println("Flag :"+flag);

        BiConsumer<Integer,Integer> f6=(a,b)-> System.out.println(a+b);
        f6.accept(60,70);



    }
}
