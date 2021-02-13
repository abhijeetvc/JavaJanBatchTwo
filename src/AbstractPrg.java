public abstract class AbstractPrg {

    int a=50;
    abstract void display();

    void display1(){
        System.out.println("In display1");
    }
}

class AbstractDemo extends AbstractPrg{

    @Override
    void display() {
        System.out.println("In display");
    }

    public static void main(String[] args) {
        AbstractDemo ad=new AbstractDemo();
//        ad.display();
//        ad.display1();
    }
}