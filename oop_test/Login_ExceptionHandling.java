import java.util.Scanner;

class BadLogin extends Exception{
    BadLogin (String message){
        super(message);
    }
}

public class Login_ExceptionHandling {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        String SignUpUName,SignUpPassword,LogInUName,LogInPassword;
        System.out.println("---SignUp---");
        System.out.print("Enter User Name : ");
        SignUpUName=SC.next();
        System.out.print("Enter Password : ");
        SignUpPassword=SC.next();
        System.out.println("---LogIn---");
        try{
            System.out.print("Enter User Name : ");
            LogInUName=SC.next();
            System.out.print("Enter Password : ");
            LogInPassword=SC.next();
        if(SignUpUName!=LogInUName){
            throw new BadLogin("Invalid UserName!");
        }
        if(SignUpPassword!=LogInPassword){
            throw new BadLogin("Invalid Password!");
        }
        System.out.println("Login Succesfull!!");
    }
        catch(BadLogin e){
            System.out.println("Bad Login "+e.getMessage());
        }
    }
}