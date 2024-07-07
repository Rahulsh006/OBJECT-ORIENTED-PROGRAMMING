package Java;

public class palindrome {
    public static void main(String[] args) {
        String originalStr = "malayalam";
        String reversedStr = "";
        
        for (int i = 0; i < originalStr.length(); i++) {
          reversedStr = originalStr.charAt(i) + reversedStr;
        }
        
        if(originalStr.equals(reversedStr)){
            System.out.println("The given word is a palindrome");
        }

        else{
            System.out.println("The given word is not a palindrome");
        }
      }
}

