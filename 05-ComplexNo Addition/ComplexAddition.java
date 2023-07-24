import java.util.Scanner;
public class ComplexAddition
{
    int r,i;
    void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Real Part : ");
        r=sc.nextInt();
        System.out.print("Enter Imaginary Part : ");
        i=sc.nextInt();
    }
    void display()
    {
        System.out.print(r+"+"+i+"i");
    }
    public static void main(String[] args)
    {
        ComplexAddition C1=new ComplexAddition();
        ComplexAddition C2=new ComplexAddition();
        ComplexAddition C=new ComplexAddition();

        C1.read();
        C2.read();
        C.r=C1.r+C2.r;
        C.i=C1.i+C2.i;
        System.out.print("After Addition : ");
        C.display();

    }
    
}