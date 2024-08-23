public class ArraySort
{
 public static void main(String[] args)
 {
   int i,j;
   int[] arr=new int[]{10,7,8,20,37,1,3,9,43,5,7};

   System.out.println("Array After Sorting");
   
   for(i=0;i<arr.length;++i)
   {
     for(j=0;j<arr.length;++j)
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
  
   for(i=0;i<arr.length;++i)
   {
    System.out.print(arr[i]+" ");
   }
  }
}
