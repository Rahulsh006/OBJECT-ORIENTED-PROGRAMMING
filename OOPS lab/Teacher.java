class employee{
    int empid, salary;
    String name, address;

    public employee(int id, String nm, int sal, String add){
        empid = id;
        name = nm;
        salary = sal;
        address = add;
    }
}

class teacher extends employee{

    String department, subject;
    public teacher(int id, String nm, int sal, String add, String dep, String sub) {
        super(id, nm, sal, add);
        department = dep;
        subject =sub;
    }

    public void display(){
        System.out.println("Name:       " + name);
        System.out.println("ID:         " + empid);
        System.out.println("Salary:     " + salary); 
        System.out.println("Address:    " + address); 
        System.out.println("Department: " + department);
        System.out.println("Subject:    " + subject);      
        System.out.println();
    }
}

class Main{
    public static void main(String[] args){
        teacher[] arr;
        arr = new teacher[5];
        arr[0] = new teacher(1, "Sherin", 27000, "Peyad", "Commerce", "Management Accounting");
        arr[1] = new teacher(2, "Anupama", 25000, "Kaithamukku", "English", "History of Literature");
        arr[2] = new teacher(3, "Dhanil", 35000, "Kattakada", "Geology", "Structural Geology");
        arr[3] = new teacher(4, "Beena", 23000, "Vilappilsala", "Malayalam", "Sanchara Sahithyam");
        arr[4] = new teacher(5, "Manoj", 29000, "Mynagappally", "Commerce", "Computer Applications");

        for(int i=0; i < arr.length;i++){
                arr[i].display();
        }
    }
}
