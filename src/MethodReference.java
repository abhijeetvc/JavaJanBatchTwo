//Method Reference :
// a) Reference to static method of particular type
// b) Reference to an instance method of particular object
// c) Reference to an instance method of arbitrary object of particular type
// d) Reference to constructor

import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {
        List<String> myValue= Arrays.asList("India","US","France","Germany");
       // myValue.forEach(MyDemo::display);
        MyDemo m=new MyDemo();
      //  myValue.forEach(m::display1);

        String[] countryList={"India","US","France","Germany"};
        Arrays.sort(countryList,String::compareToIgnoreCase);

        for(String s1:countryList){
            System.out.println(s1);
        }


    }
}

class MyDemo{
    public static void display(String str){
        System.out.println("Value: "+str);
    }

    public void display1(String s){
        System.out.println("Value: "+s);
    }
}