package Java;

public class prime {
    public static void main(String args[]) {
        int x = 37;
        int i = 1;
        int count = 0;
        while(i <= x){
            if(x%i == 0){
                count++;
            }
            i++;
        }
        if(count <= 2){
            System.out.println("The given no. is a prime number");
        }
        else{
            System.out.println("The given no. is not prime ");
        }
    }
}
