package Graphics;

public class Circle implements Shape {
    double r;
    public Circle(double r){
        this.r=r;
    }

    public void area(){
        System.out.println((3.14*r*r));
    }
    
}
