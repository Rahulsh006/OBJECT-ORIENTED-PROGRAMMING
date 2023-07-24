public class palindrome_String
{
 public static void main(String[] args)
 {
  String a="MALAYALAM",b="";
  int len,i;
  len=a.length();
  for(i=len-1;i>=0;i--)
  {
   b=b+a.charAt(i);
  }


	//System.out.println(a);
	//System.out.println(b);


  if(a.equals(b))
  {
   System.out.println(a+" is Palindrome.");
  }
  else
  {
   System.out.println(a+" is not Palindrome.");
  }
 }
}
