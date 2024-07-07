import java.util.Scanner;

public class Arraysearch {

    public static int elsearch(int a[], int b){
        for(int i=0;i<a.length;i++){
            if(a[i]==b){
            return 1;
            }
        }
    return 0;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to search");
        int b = sc.nextInt();

        int temp = elsearch(a, b);

        if(temp ==1){
            System.out.println("Value present in array");
        }

        else{
            System.out.println("Value not Found");
        }
    }
}





              


