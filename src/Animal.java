// Inheritance: One class defined from another class.
// It is also called as 'is-a' relationship
// Types: Single, Multilevel, Multiple, Hierarchical, hybrid

public class Animal {

    public Animal(){
        System.out.println("In animal class constructor");
    }

     void eat(){
        System.out.println("All animals eat");
    }

    public void run(){
        System.out.println("ALl animals run");
    }
}

class Animal1{
    public void fly(){
        System.out.println("All bids fly");
    }
}

