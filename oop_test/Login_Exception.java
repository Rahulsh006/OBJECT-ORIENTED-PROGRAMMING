import java.util.Scanner;

class Fakelogin extends Exception{
    Fakelogin(String message){
        super(message);
    }
}

public class Login_Exception{
    public static void main(String[] args) {
        String suname,spass,luname,lpass;
        Scanner sc = new Scanner(System.in);
        System.out.println("---Sign up!--");
        System.out.println("enter username for signing in: ");
        suname= sc.next();
        System.out.println("enter password for signing in : ");
        spass= sc.next();
        System.out.println("---login in---");
        try{
            System.out.println("enter your username: ");
            luname= sc.next();
            System.out.println("enter your password: ");
            lpass= sc.next();
            if (suname.equals(luname)){
            System.out.println("login successfull, Welcome : "+luname);
            }
            else{
            if(!suname.equals(luname)){
                throw new Fakelogin("invalid username!");
            }
            if (!spass.equals(spass)){
                throw new Fakelogin("incorrect password");
            }
        }
        }
        catch(Fakelogin e){
            System.out.println("exception occured "+e.getMessage());

        }

    }
}