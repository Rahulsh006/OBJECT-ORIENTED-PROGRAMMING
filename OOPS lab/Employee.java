import java.util.Scanner;

public class employee {
    int eno , salary;
    String name;

    public employee(int en, int sl , String nm){
        eno = en;
        salary = sl;
        name = nm;
    }

    public void display(){
        System.out.println("Name:   " + name);
        System.out.println("Salary: " + salary);
    }
}

class Main{

    public static int emsearch(int s, employee[] arr){

        for(int i=0; i < arr.length;i++){
            if(arr[i].eno == s){
                arr[i].display();
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        employee[] arr;
        arr = new employee[5];
        arr[0] = new employee(1, 25000, "Robert");
        arr[1] = new employee(2, 30000, "Bob");
        arr[2] = new employee(3, 25000, "Ivan");
        arr[3] = new employee(4, 35000, "Alice");
        arr[4] = new employee(5, 30000, "Catherine");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee number to search");
        int s = sc.nextInt();

        int x = emsearch(s,arr);
        
        if(x == 0){
            System.out.println("The given ID does not exist");
        }
        
    }
}
