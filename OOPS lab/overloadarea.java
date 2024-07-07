import java.util.Scanner;

public class overloadarea {
    public void area(float base, float height){
        base *= 0.5;
        float a = base*height;
        System.out.println("The area of triangle " + a);
    }

        public void area(int side){
        int a = side*side;
        System.out.println("The area of square " + a);
    }

    public void area(double radius){
        double a = 3.14*radius*radius;
        System.out.println("The area of circle " + a);
    }    

    public static void main(String[] args){
        float b,h,a;
        int s;
        double r;
        Scanner sc = new Scanner(System.in);
        overloadarea ob = new overloadarea();
        System.out.println("Triangle Area");
        System.out.println("Enter Base: ");
        b= sc.nextFloat();
        System.out.println("Enter Height: ");
        h= sc.nextFloat();
        ob.area(b,h);

        System.out.println("square Area");
        System.out.println("Enter side: ");
        s= sc.nextInt();
        ob.area(s);

        System.out.println("circle Area");
        System.out.println("Enter side: ");
        r= sc.nextDouble();
        ob.area(r);
    }

}
