public class prime
{
 public static void main(String[] args)
 {
  int n=17,flag=0,i;
  for (i=2;i<n;i++)
  {
   if(n%i==0)
   {
    flag=flag+1;
   }
  }
  if(flag==0)
  {
   System.out.println(n+" is a Prime Number.");
  }
  else
  {
   System.out.println(n+" is not a Prime Number.");
  }
 }
}
