import java.util.Scanner;

class Arraysort{
    public static void main(String[] args) {
        int n,i,j,temp;
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of the array : ");
        n= sc.nextInt();
        int[] array= new int[n];
        System.out.print("enter the array elements : ");
        for( i=0;i<n;i++){
            array[i]=sc.nextInt();
        }

        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(array[i]> array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        System.out.print("The sorted array is : ");
        for(i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        sc.close();


    }
    
}