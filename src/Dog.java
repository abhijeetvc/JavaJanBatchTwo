
class Dog extends Animal{

    public Dog(){
        System.out.println("In dog class constructor");
    }

    public Dog(String name){
        System.out.println("Name is: "+name);
    }
    public void bark(String str){
        System.out.println("All dogs bark");
    }

//    public static void main(String[] args) {
//        Dog d=new Dog();
//        d.eat();
//        d.run();
//        d.bark();
//    }
}
class Puppy extends Dog{

    public Puppy(){
       super("German Shepherd");
       System.out.println("In puppy class constructor");
    }

    public void bark(String str1){
       // super.bark();
        System.out.println("Puppy barks");
    }

//    public static void main(String[] args) {
//        Puppy p=new Puppy();
//        p.eat();
//        p.run();
//        p.bark();
//      //  p.bark1();
//    }
}

class MainCheck{
    public static void main(String[] args) {
        Puppy p=new Puppy();

    }
}