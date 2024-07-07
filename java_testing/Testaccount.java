class Account{
    int acc_no;
    String name;
    float amount;


    void insert(int a,String n,float amt ){
        acc_no= a;
        name= n;
        amount= amt;
    }
    
    void login(){
        System.out.println("Welcome  "+ name);
    }

    void deposit(float amt){
        amount=amount+amt;
        System.out.println(amt+" deposited");
    }

    void withdraw(float amt){
        if (amt>amount){
            System.out.println("insufficient balance");
        }
        else{
            amount=amount-amt;
            System.out.println(amt+" withdrawn");
        }
    }

    void showbalance(){
        System.out.println("avalailable balance is "+ amount);
        
    }
    void vewacc_details(){
        System.out.println("your acc no is "+ acc_no +"  your name is "+name+"  your balance amount is "+amount);

    }
}

class Testaccount{
    public static void main(String[] args) {
        Account a1= new Account(), a2=new Account();

        a1.insert(001, "aravind", 10000);
        a1.login();
        a1.deposit(4000);
        a1.withdraw(3000);
        a1.showbalance();
        a1.vewacc_details();


        a2.insert(002, "aiswarya", 25000);
        a2.login();
        a2.deposit(2000);
        a2.withdraw(10000);
        a2.showbalance();
        a2.vewacc_details();
    }
}