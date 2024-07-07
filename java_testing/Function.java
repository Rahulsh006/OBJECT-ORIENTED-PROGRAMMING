import java.util.Scanner;
public class Function{

    public static void sumof(int a,int b){
            int c= a+b;
            System.err.println("the sum is "+c);
        }

    public static void oddoreven(int a){
        if (a%2==0) System.out.println("even");
        else if (a%2!=0) System.out.println("odd");
    }









        public static void main(String[] args) {
        sumof(5,6);
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number: ");
        int num= sc.nextInt();
        oddoreven(num);

    }
    
}