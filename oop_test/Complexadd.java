 import java.util.Scanner;


public class Complexadd {
    int r,i;
    void insert(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the real part:");
        r = sc.nextInt();
        System.out.print("enter the imaginary part:");
        i = sc.nextInt();
    }

    void display(){
        System.out.println(r+ "+"+i+"i");

    }

    public static void main(String[] args) {
        Complexadd obj1 = new Complexadd();
        Complexadd obj2 = new Complexadd();
        Complexadd obj3 = new Complexadd();


        obj1.insert();
        obj1.display();
        obj2.insert();
        obj2.display();

        obj3.r= obj1.r+obj2.r;
        obj3.i= obj1.i+obj2.i;

        obj3.display();
    }
}
