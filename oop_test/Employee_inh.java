import java.util.Scanner;



class Employee_inh {
    int eno;
    String ename;
    double esalary;
    Employee_inh(int eno,String ename,double esalary){
        this.eno= eno;
        this.ename=ename;
        this.esalary=esalary;
    }
}
class Teacher extends Employee_inh{
    String dept,subject;
    Teacher(int eno,String ename, double esalary,String dept, String subject){
        super(eno,ename,esalary);
        this.dept= dept;
        this.subject= subject;
    }
}

public class Teacher_inh{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the no of teachers:");
        n= sc.nextInt();
        Teacher list[]= new Teacher[n];
        for(int i=0;i<n;i++){
            list[i]= new Teacher(01,"anu",2000,"mca","ads");
        }
         for(int i=0;i<n;i++){
            System.out.println(list[i]+" \n");
         }


    }
}
