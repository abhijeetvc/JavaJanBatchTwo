public interface Rbi {

    void withdraw();
    void deposit();
}

interface Rbi1{
    void withdraw();
}

class Sbi implements Rbi,Rbi1{

    @Override
    public void withdraw() {
        System.out.println("In withdraw of Sbi");
    }

    @Override
    public void deposit() {
        System.out.println("In deposit of sbi");
    }

    public void checkBal(){
        System.out.println("Check bal of Sbi");
    }
}

class Hdfc implements Rbi{

    @Override
    public void withdraw() {
        System.out.println("In withdraw of Hdfc");
    }

    @Override
    public void deposit() {
        System.out.println("In deposit of Hdfc");
    }

    public void checkBal(){
        System.out.println("Check bal of Hdfc");
    }
}

class MainCheck1{
    public static void main(String[] args) {
         Sbi s=new Sbi();
        s.deposit();
        s.withdraw();
    }
}

