class Student{  
int rollno;  
String name;  
float fee;  
int age;
Student(int rollno,String name,float fee, int age){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
this.age=age;
}  
void display(){System.out.println(rollno+" "+name+" "+fee+" "+age);}  
}  
class TestThis1{  
public static void main(String args[]){  
Student s1=new Student(111,"ankit",5000f,17);  
Student s2=new Student(112,"sumit",6000f,18);  
s1.display();  
s2.display();  
}} 