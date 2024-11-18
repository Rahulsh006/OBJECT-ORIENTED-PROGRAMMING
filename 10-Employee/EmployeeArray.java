import java.util.Scanner;

class Employee{
    private int e_number;
    private String e_name;
    private double e_salary;

    public Employee(int e_number,String e_name,double e_salary){
        this.e_number=e_number;
        this.e_name=e_name;
        this.e_salary=e_salary;
    }
    public int getE_Number(){
        return e_number;
    }
    public String getE_Name(){
        return e_name;
    }
    public double getE_Salary(){
        return e_salary;
    }
}

public class EmployeeArray{
    public static void main(String[] args) {
        Scanner S1 = new Scanner(System.in);
        System.out.print("Enter No of Employees : ");
        int n = S1.nextInt();
        Employee[] employees = new Employee[n];
        for(int i=0;i<n;i++){
            System.out.print("\nEnter Details of Employee "+(i+1));
            System.out.print("\n--------------------------------");
            System.out.print("\nEmployee Number : ");
            int e_number = S1.nextInt();
            System.out.print("Employee Name : ");
            String e_name = S1.next();
            System.out.print("Employee Salary : ");
            double e_salary = S1.nextDouble();
            employees[i] = new Employee(e_number, e_name, e_salary);
        }
        System.out.print("\nEnter Employee No to Search : ");
        int empSearch = S1.nextInt();
        int flag=0;
        for (Employee employee: employees){
            if(employee.getE_Number()==empSearch){
                flag=flag+1;
                System.out.println("Employee Found!");
                System.out.println("\nEmployee Number = "+employee.getE_Number());
                System.out.println("Employee Name = "+employee.getE_Name());
                System.out.println("Employee Salary = "+employee.getE_Salary());
                break;
            }
        }
        if(flag==0){
            System.out.println("Employee Not Found!");
        }
        S1.close();
    }
    
}
