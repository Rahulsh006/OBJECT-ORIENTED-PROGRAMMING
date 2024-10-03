import java.util.*;
public class ArraySearch{
	public static void main(String[] args){
		int n,x;
		int location=-1;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter Array Size: ");
		n=s.nextInt();

		int[] a=new int[n];

		
		System.out.print("Enter Elements : ");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		
		System.out.print("Enter Element to Search : ");
		x=s.nextInt();

		for(int i=0;i<n;i++){
			if(x==a[i]){
				location=i;
				break;
			}
		}
		if(location==-1){
			System.out.printf("%d Not Present in The Array!\n",x);
		}
		else{
			System.out.printf("%d Found at Index %d !\n",x,location);
		}
	}
}
				
