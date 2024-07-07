import java.util.Scanner;

class Shape_overload {
void area(int a){
    System.out.println("area of the square is: "+ a*a);
}

void area(double r){
    System.out.println("area of the circle is:  "+ (3.14*r*r));
}
void area(int l,int b){
    System.out.println("area of the reactangle is: "+ l*b);
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the side of the square: ");
    int a= sc.nextInt();
    System.out.println("enter the radius of the circle: ");
    double r = sc.nextDouble();
    System.out.println("enter the length of rectangle : ");
    int l= sc.nextInt();
    System.out.println("enter the breadth of rectangle : ");
    int b= sc.nextInt();

    Shape_overload obj = new Shape_overload();
    obj.area(a);
    obj.area(r);
    obj.area(l,b);

   



}
}
