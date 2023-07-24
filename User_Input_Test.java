import java.util.*;
public class User_Input_Test
{
 public static void main(String[] args)
 {
  Scanner S1=new Scanner(System.in);
  System.out.print("Enter Roll Number : ");
  int roll=S1.nextInt();
  System.out.println("Enter Name : ");
  String name=S1.nextLine();
  System.out.println("====================================================\nName : "+name+"\nRollNo : "+roll);
 }
}

  
