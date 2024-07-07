import java.util.Scanner;

class Employeearray{
    int emp_no;
    String emp_name;
    double emp_salary;

    void read_data(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter employee number: ");
    emp_no = sc.nextInt();
    System.out.println("enter enmployee name: ");
    emp_name = sc.next();
    System.out.println("enter enmployee salary : ");
    emp_salary = sc.nextDouble();

    }
    void display(){
        System.out.println("employee number:"+ emp_no);
        System.out.println("employee name "+ emp_name);
        System.out.println("employee salary "+ emp_salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        System.out.println("enter no of employee:  ");
        no = sc.nextInt();
        Employeearray list[]= new Employeearray[no];
        for(int i =0;i<no;i++){
            list[i]= new Employeearray();
            list[i].read_data();
        }

        System.out.println("enter an employee number to search:  ");
        int searchno;
        searchno = sc.nextInt();
        int flag =0;
        for (int i=0;i<no;i++){
            if(list[i].emp_no == searchno){
                flag=flag+1;
                list[i].display();
            }
        }
         if (flag!=0){
            System.out.println("employee found");
            
                
            }
        else{
            System.out.println("employee not found");
        }    

    }

    }

