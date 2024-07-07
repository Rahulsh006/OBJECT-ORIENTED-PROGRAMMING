import java.util.Scanner;

class Arraysort {
public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);
int n,temp,i,j;
System.out.println(" enter array size");
n= sc.nextInt();

int a[]= new int[n];
System.out.println("enter array elements");
for (i=0;i<n;i++){
    a[i]= sc.nextInt();
}
for (i=0;i<n;i++){
    for(j=i+1;j<n;j++){
        if(a[i]>a[j]){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
}

System.out.println("the sorted array is ");
for (i=0;i<n;i++){
    System.out.print(a[i]+"  ");

}
sc.close();


}
    
}
