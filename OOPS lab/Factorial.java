package Java;

public class factorial {
    public static void main(String[] args) {
      int result = fact(3);
      System.out.println(result);
    }
    public static int fact(int k) {
      if (k > 1) {
        return k * fact(k - 1);
      } else {
        return k;
      }
    }
}
