public class fibonacci
{
 public static void main(String[] args)
 {
  int a=0,b=1,c,n=5,i;
  System.out.println(a+"\n"+b);
  for (i=2;i<n;i++)
  {
   c=a+b;
   System.out.println(c);
   a=b;
   b=c;
  }
 }  
}
