package Graphics;

public class Square implements Shape{
    int a;
    public Square(int a){
        this.a=a;
    }
public void area(){
        System.out.println(a*a);
    }
    
}
