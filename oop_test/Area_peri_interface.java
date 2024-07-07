import java. util.Scanner;


interface shape_interface {
    void read_data();
    void area();
    void perimeter();

}

class Circle implements shape_interface{
    int r;
    public void read_data(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the radius of the circle: ");
    r= sc.nextInt(); 
    }

    public void area(){
        System.out.println("area of the circle is : "+(3.14*r*r));
    }

    public void perimeter(){
        System.out.println("perimeter of the circle is "+ 2 * 3.14 * r);
    }
}

class Square implements shape_interface{
    int a;
    public void read_data(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the side of the square: ");
    a= sc.nextInt();       
    }
    public void area(){
        System.out.println("area of the square is : "+ a*a);
    }

    public void perimeter(){
        System.out.println("perimeter of the square is: "+ 4 * a);
    }

}

class Reactangle implements shape_interface{
    int l,b;
    public void read_data(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the length of the rectangle: ");
    l= sc.nextInt(); 
    System.out.println("enter the breadth of the rectangle: ");
    b= sc.nextInt();        
    }
    public void area(){
        System.out.println("area of the rectangle is : "+ l*b);
    }

    public void perimeter(){
        System.out.println("perimeter of the rectangle is: "+ 2*(l+b));
    }

}

public class Area_peri_interface{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Square s1= new Square();
        Reactangle r1= new Reactangle();

        c1.read_data();
        c1.area();
        c1.perimeter();

        s1.read_data();
        s1.area();
        s1.perimeter();

        r1.read_data();
        r1.area();
        r1.perimeter();


    }
    
}
