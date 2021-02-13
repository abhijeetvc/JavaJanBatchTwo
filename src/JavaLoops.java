import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaLoops {
    public static void main(String[] args) {

//        for(int i=1;i<=5;++i){
//            System.out.println(i);
//        }
//
//        int i=1;
//        for(;i<=5;){
//            System.out.println(i);
//            ++i;
//        }

        int a=10;
        int b=20;
        int result=++a+b;
        int result1=a+++b;
        System.out.println("Result: "+result1);
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);

        List<Integer> list= Arrays.asList(10,5,15,20,30,35);
        //Normal Java
//        for(int x=0;x<list.size();x++){
//            System.out.println(list.get(x));
//        }
        //Normal Java
//        for(Integer val:list){
//            System.out.println(val);
//        }
        //Java 8 lambda expression
        list.forEach(val-> System.out.println(val));

        // Java 8 method reference
       // list.forEach(System.out::println);

        List<String> list1=Arrays.asList("India","US","France","China","Germany");

        List<String> newList=list1.stream().filter(str->!"China".equals(str)).collect(Collectors.toList());
        System.out.println(newList);

        int i=1;
        while(i<=5){
            System.out.println(i);
            i++;
        }
    }
}
