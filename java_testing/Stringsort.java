import java.util.Scanner;
public class Stringsort {
    public static void main(String[] args) {
        int i,j;
        String temp;
        System.out.println("enter the no of words");
        Scanner sc =new Scanner(System.in);
        int count = sc.nextInt();
        String list[]= new String[count];
        System.out.println("enter the strings");
        for(i=0;i<count;i++){
            list[i]=sc.next();
        }

        for (i=0;i<count;i++){
            for(j=i+1;j<count;j++){
                if(list[i].compareTo(list[j])>0){
                    temp= list[i];
                    list[i]=list[j];
                    list[j]=temp;
                }
            }
        }
        System.out.println("the sorted strings are: ");
        for (i=0;i<count;i++){
             System.out.print(list[i]+" ");
        }



    }
    
}
