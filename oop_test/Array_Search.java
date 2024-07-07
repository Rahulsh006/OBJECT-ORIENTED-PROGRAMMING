import java.util.Scanner;

public class Array_Search {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n,item,i,flag=0;
        System.out.print("Enter Array Size : ");
        n=SC.nextInt();
        int a[] = new int [n];
        System.out.print("Enter Elements : ");
        for (i=0;i<n;i++){
            a[i]=SC.nextInt();
        }
        System.out.print("Enter Element to Search : ");
        item=SC.nextInt();
        for (i=0;i<n;i++){
            if(a[i]==item){
                flag=flag+1;
            }
        }
        if(flag!=0){
            System.out.print("Item Found!!");
        }
        else{
            System.out.print("Item Not Found!!");
        }
    }
}