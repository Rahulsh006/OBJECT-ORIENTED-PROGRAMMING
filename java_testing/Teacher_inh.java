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
            System.out.println("Enter details for teacher " + (i + 1) + ":");
            System.out.println("Enter eno:");
            int eno = sc.nextInt();
            System.out.println("Enter ename:");
            String ename = sc.next();
            System.out.println("Enter esalary:");
            double esalary = sc.nextDouble();
            System.out.println("Enter dept:");
            String dept = sc.next();
            System.out.println("Enter subject:");
            String subject = sc.next();
            
            list[i] = new Teacher(eno, ename, esalary, dept, subject);
        }
         for(int i=0;i<n;i++){
            System.out.println(list[i]+" \n");
         }


    }
}
