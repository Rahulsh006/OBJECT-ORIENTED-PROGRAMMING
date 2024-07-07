import java.util.Scanner;
public class Stringmanipulation {
    public static void main(String[] args) {
        String word, wordtu;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        word= sc.next();
        System.out.println("length of the string is "+ word.length());
        System.out.println("Uppercase: "+ word.toUpperCase());
        System.out.println("Lowecase: "+word.toLowerCase());
        System.out.println("index: "+word.charAt(0));
        System.out.println("enter second string: ");
        wordtu = sc.next();
        System.out.println("concated string: "+word.concat(wordtu));
        


    }
    
}
