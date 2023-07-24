import java.util.Scanner;
public class ArraySortUser
{
 public static void main(String[] args)
 {
   int i,j;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter No. of Elements in Array : ");
   int n = sc.nextInt();
   int[] arr=new int[n];
   System.out.print("Enter Elements : ");
   for(i=0;i<n;i++)
   {
    arr[i]=sc.nextInt();
   }
   System.out.println("Array After Sorting");
   for(i=0;i<n;++i)
   {
     for(j=0;j<n;++j)
     {
       int temp = 0;
       if(arr[i]<arr[j])
       {
         temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
        }
      }
   }
   for(i=0;i<n;++i)
   {
    System.out.print(arr[i]+" ");
   }
  }
}
