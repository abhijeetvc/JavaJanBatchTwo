
@FunctionalInterface
interface DemoInterface{
    ReferenceToConstructor showMessage(String m);
}

public class ReferenceToConstructor {

    public ReferenceToConstructor(String message){
        System.out.println(message);
    }
}

class CheckMReference{
    public static void main(String[] args) {
//        ReferenceToConstructor rc=new ReferenceToConstructor("Helloooo");
        DemoInterface d=ReferenceToConstructor::new;
        d.showMessage("Hiiiiiiiii");
    }
}
