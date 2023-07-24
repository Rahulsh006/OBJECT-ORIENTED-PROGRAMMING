public class armstrong
{
 public static void main(String[] args)
 {
  int n=153,x,y,sum=0; //x takes the og number temp and y is for storing remainder :)
  x=n;
  while(x!=0)
  {
   y=x%10;
   sum=sum+(y*y*y);
   x=x/10;
  }
  if(sum==n)
  {
   System.out.println(n+" is an Armstrong Number.");
  }
  else
  {
   System.out.println(n+" is not an Armstrong Number.");
  }
 }
}
