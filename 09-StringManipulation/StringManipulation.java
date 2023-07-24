import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a string from the user
        System.out.print("Enter A String: ");
        String inputString = scanner.nextLine();

        // String length
        int length = inputString.length();
        System.out.println("Length of the string: " + length);

        // Convert to uppercase and lowercase
        String uppercase = inputString.toUpperCase();
        String lowercase = inputString.toLowerCase();
        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);

        // Extract a substring
        System.out.print("Enter the starting index for the substring: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter the ending index for the substring: ");
        int endIndex = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        if (startIndex >= 0 && startIndex < length && endIndex >= startIndex && endIndex <= length) {
            String substring = inputString.substring(startIndex, endIndex);
            System.out.println("Substring: " + substring);
        } else {
            System.out.println("Invalid substring indices.");
        }

        // Check if a substring exists
        System.out.print("Enter a substring to search for: ");
        String searchString = scanner.nextLine();
        boolean containsSubstring = inputString.contains(searchString);
        System.out.println("Contains substring? " + containsSubstring);

        // Replace a substring
        System.out.print("Enter the substring to replace: ");
        String replaceString = scanner.nextLine();
        System.out.print("Enter the replacement string: ");
        String replacement = scanner.nextLine();
        String replacedString = inputString.replace(replaceString, replacement);
        System.out.println("Replaced string: " + replacedString);

        // Split the string
        System.out.print("Enter the delimiter for splitting the string: ");
        String delimiter = scanner.nextLine();
        String[] splitStrings = inputString.split(delimiter);
        System.out.println("Split strings:");
        for (String str : splitStrings) {
            System.out.println(str);
        }

        // Trim leading and trailing whitespace
        String trimmedString = inputString.trim();
        System.out.println("Trimmed string: " + trimmedString);

        // Check if the string starts with a particular prefix
        System.out.print("Enter a prefix to check: ");
        String prefix = scanner.nextLine();
        boolean startsWithPrefix = inputString.startsWith(prefix);
        System.out.println("Starts with prefix? " + startsWithPrefix);

        // Check if the string ends with a particular suffix
        System.out.print("Enter a suffix to check: ");
        String suffix = scanner.nextLine();
        boolean endsWithSuffix = inputString.endsWith(suffix);
        System.out.println("Ends with suffix? " + endsWithSuffix);

        scanner.close();
    }
}
