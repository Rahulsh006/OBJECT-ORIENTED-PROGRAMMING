public class palindrome_Number
{
 public static void main(String[] args)
 {
  int n=151,x,y,rev=0; //x takes the og number temp and y is for storing remainder :)
  x=n;
  while(x!=0)
  {
   y=x%10;
   rev=(rev*10)+y;
   x=x/10;
  }
  if(rev==n)
  {
   System.out.println(n+" is a Palindrome Number.");
  }
  else
  {
   System.out.println(n+" is not a Palindrome Number.");
  }
 }
}
