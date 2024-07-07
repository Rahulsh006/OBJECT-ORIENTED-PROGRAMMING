import java.util.*;

class uname_exception extends Exception{
    uname_exception(String msg){
        System.out.println(msg);
    }
}

class pwd_exception extends Exception{
    pwd_exception(String msg){
        System.out.println(msg);
    }
}

public class Exception1 {
    public static void main(String[] args){
        String user_name = "Manu";
        String password = "Manu@123";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username : ");
        String uname = sc.next();
        while (uname.compareTo(user_name) != 0){
            try{
                throw new uname_exception("Wrong username...!");
            }
            catch(uname_exception e){
                System.out.println("Exception handled");
            }
            System.out.println("Enter username : ");
            uname = sc.next();
        }
        System.out.println("Enter password : ");
        String pwd = sc.next();
        while(pwd.compareTo(password) != 0){
            try{
                throw new pwd_exception("Wrong username...!");
            }
            catch(pwd_exception e){
                System.out.println("Exception handled");
            }
            System.out.println("Enter password : ");
            pwd = sc.next();
        }
        System.out.println("Login Successful...!");

    }
}