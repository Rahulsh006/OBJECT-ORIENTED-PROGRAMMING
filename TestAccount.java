import java.util.Scanner;
class Account{  
int acc_no;  
String name;  
float amount;  
//Method to initialize object  
void insert(int a,String n,float amt){  
acc_no=a;  
name=n;  
amount=amt;  
}  
//deposit method  
void deposit(float amt){  
amount=amount+amt;  
System.out.println(amt+" deposited");  
}  
//withdraw method  
void withdraw(float amt){  
if(amount<amt){  
System.out.println("Insufficient Balance");  
}else{  
amount=amount-amt;  
System.out.println(amt+" withdrawn");  
}  
}  
//method to check the balance of the account  
void checkBalance(){System.out.println("Balance is: "+amount);}  
//method to display the values of an object  
void display(){System.out.println(acc_no+" "+name+" "+amount);}  
}  
//Creating a test class to deposit and withdraw amount  
class TestAccount
{  
    public static void main(String[] args)
    {  
    int option;
    Account a1=new Account();  
    Scanner sc =new Scanner(System.in);
    System.out.println("welcome to SBI ");
    System.out.println("1.Enter details \n2.Deposit \n3.Withdraw \n4.Checkbalance \n5.display \n6.Exit ");
    System.out.println("Enter your choice:  ");
    option =sc.nextInt();
    while(true){
        switch(option){
            case 1:
                System.out.println("enter your acc no:");
                int a=sc.nextInt();
                System.out.println("enter your name: ");
                String n=sc.next();
                System.out.println("enter your amount:");
                float amt=sc.nextFloat();
                a1.insert(a, n, amt);
                break;

            case 2:
                System.out.println("enter the amount to deposit: ");
                float dep = sc.nextFloat();
                a1.deposit(dep);
                break;

            case 3:
                System.out.println("enter the amount to withdraw: ");
                float wit=sc.nextFloat();
                a1.withdraw(wit);
                break;

            case 4:
                a1.checkBalance();
                break;

            case 5:
                a1.display();
                break;

            case 6:
                System.out.println("Thank you for using SBI. Exiting the program.");
                System.exit(0);
                break;  

            default:
                System.out.println("enter a valid option: ");
                break;
            }
        }
    }
}   