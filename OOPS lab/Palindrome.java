package Java;

public class palindrome {
    public static void main(String[] args) {
        int a = 2552;
        int b = a;
        int result = pal(a);
        if(result == b){
            System.out.println("The given no. is a Palindrome");
        }
        else{
        System.out.println("The given no. is not a Palindrome");
        }
      }
      public static int pal(int n){
        int rev = 0;
        int x = 0;
        while(n > 0){
            x = n % 10;
            rev = (rev * 10) + x ;
            n = n/10;
        }
        return rev;
      }
}
