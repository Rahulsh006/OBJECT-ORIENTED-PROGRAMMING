public class factorial
{
 public static void main(String[] args)
 {
  int x=1,i,n=5;
  for(i=1;i<n+1;i++)
  {
   x=x*i;
  }
  System.out.println("Factorial of "+n+" -- "+n+"! = "+x);
 }
}
