import java.util.Scanner;


public class Matrixadd {
    public static void main(String[] args) {
        int i,j,m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of matrix : MxN");
        m=sc.nextInt();
        n=sc.nextInt();
        int a [][]= new int [m][n];
        int b [][]= new int [m][n];
        int c [][]= new int [m][n];

         System.out.println("enter the matrix 1 elements: ");
         for (i=0;i<m;i++){
            for(j=0;j<n;j++){
                a[i][j]= sc.nextInt();
            }
         }
        System.out.println("enter the matrix 2 elements: ");
         for (i=0;i<m;i++){
            for(j=0;j<n;j++){
                b[i][j]= sc.nextInt();
            }
         }

        for (i=0;i<m;i++){
            for(j=0;j<n;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("the sum of two matrix is ");
        for (i=0;i<m;i++){
            for(j=0;j<n;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();

         }
        sc.close();

    }


    
}
