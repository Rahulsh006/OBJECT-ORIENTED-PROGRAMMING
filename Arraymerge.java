import java.util.Scanner;

class Arraymerge{
    public static void main(String[] args) {
        int m,n,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("ener the size of the first array: ");
        n= sc.nextInt();
        int []arr1= new int[n];
        System.out.print("enter first array elements : ");
        for(i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("ener the size of the second array: ");
        m= sc.nextInt();
        int []arr2= new int[m];
        System.out.print("enter second array elements : ");
        for(j=0;j<m;j++){
            arr2[j]=sc.nextInt();
        }
        // merging to be done

        int []final_array= new int[m+n];
        for(i=0;i<n;i++){
            final_array[i]=arr1[i];
        }
        for(j=0;j<m;j++){
            final_array[n+j]=arr2[j];
        }

        System.out.print("The merged array is : ");
        for(i=0;i<m+n;i++){
            System.out.print(final_array[i]+" ");
        }
        sc.close();

    }
}