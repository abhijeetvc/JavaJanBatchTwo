public interface MyInterface {
    int a = 10;
    void display();
    void display1();
}

class MyInterfaceDemo implements MyInterface{

    @Override
    public void display() {
        System.out.println("In display"+a);
    }

    @Override
    public void display1() {
        System.out.println("In display1");
    }

    public void display2(){
        System.out.println("In display2");
    }

    public static void main(String[] args) {
        MyInterfaceDemo i=new MyInterfaceDemo();
        i.display();
        i.display1();
        i.display2();
    }
}