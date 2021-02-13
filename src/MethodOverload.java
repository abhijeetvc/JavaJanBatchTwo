public class MethodOverload {

    public void calculateArea(Double radius){
        double areaOfCircle=3.14*radius*radius;
        System.out.println("Area of circle: "+areaOfCircle);
    }

    public void calculateArea(int a,int b){
        int areaOfRect=a*b;
        System.out.println("Area of Rect: "+areaOfRect);
    }

    public static void main(String[] args) {
        MethodOverload m=new MethodOverload();
        m.calculateArea(5.0);
        m.calculateArea(5,10);
    }
}

