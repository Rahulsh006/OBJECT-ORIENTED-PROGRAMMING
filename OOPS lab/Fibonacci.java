package Java;

public class fibonacci {
    public static void main(String[] args) {
    fibo(10);
    }
    public static int fibo(int n) {
        int i = 0;
        int j = 1;
        int k = 0;
      while (n>=1) {
        System.out.println(i);
        n = n-1;
        k = i+j;
        i = j;
        j = k;
      } 
      return 0;
    }
}
