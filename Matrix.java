import java.util.Scanner;

class Matrix {
    public static void main(String[] args) {
        int i,j,m,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the matrix MxN: ");
        m=sc.nextInt();
        n=sc.nextInt();
        int [][]a= new int[m][n];
        int [][]b= new int[m][n];
        int [][]c= new int[m][n];

        System.out.print("enter the elements of the first matrix : ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("enter the elements of the second matrix : ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                b[i][j]=sc.nextInt();
            }
        }

        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }

        System.out.print("SUm of two matrices  : ");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
               System.out.print( c[i][j]+" ");
            }
            System.out.println();
        }


    }
    }
