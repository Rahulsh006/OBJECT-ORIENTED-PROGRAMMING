package Java;
import java.lang.Math;

public class armstrong {
    public static void main(String[] args){
    int n = 9474;
    int no =  n;
    int len = String.valueOf(n).length();
    int x = 0;
    int arm = 0;
        for(int i = 0; i<len; i++){
            x = n % 10;
            int power = (int)Math.pow(x, len);
            arm = arm + (power);
            n = n/10;
        }
    if(no==arm){
        System.out.println("The given number is an Armstrong number");
    }
    else{
        System.out.println("The given number is not an Armstrong number");
    }
}
}
