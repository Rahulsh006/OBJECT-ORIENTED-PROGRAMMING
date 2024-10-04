import java.util.*;
public class MatrixAddition
{
    public static void main(String[] args)
    {
      int i,j;
      Scanner sc= new Scanner(System.in);    
      System.out.print("Enter Size of Thee Matrix [mxn]  : ");  
      int m= sc.nextInt();
      int n= sc.nextInt();

      int[][] mat1 = new int[10][10];
      System.out.println("Enter First Matrix ");
      for(i=0;i<m;++i)
      {
        for(j=0;j<n;++j)
        {
           mat1[i][j] = sc.nextInt();
        }
         
      } 

      int[][] mat2 = new int[10][10];
      System.out.println("Enter Second Matrix");
      for(i=0;i<m;++i)
      {
        for(j=0;j<n;++j)
        {
           mat2[i][j] = sc.nextInt();
        }
         
      } 
     System.out.println("-------------------");
     int sum[][] = new int[10][10];
     System.out.println("Sum of Matrices are ");
     for(i=0;i<m;++i)
     {
        for(j=0;j<n;++j)
        {
            sum[i][j] = mat1[i][j] + mat2[i][j];
            System.out.print(sum[i][j] + "\t");
            
        }
        System.out.println();
     }
     System.out.println("-------------------");
    }
}
