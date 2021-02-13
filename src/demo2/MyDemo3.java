package demo2;

import demo1.MyDemo1;

public class MyDemo3 extends MyDemo1{

    public static void main(String[] args) {
        MyDemo3 m=new MyDemo3();
        System.out.println(m.myvar2);
    }
}

class MyDemo4 extends MyDemo3{

    public static void main(String[] args) {
        MyDemo4 m4=new MyDemo4();
        System.out.println(m4.myvar2);
    }
}