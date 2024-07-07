public class TestException {
    public static void main(String[] args) {
        try {
            String str = "helloworld";
            char s = str.charAt(12);
            System.out.println(s);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Exception handled!");
        } finally {
            System.out.println("I always get executed!");
        }

        System.out.println("Rest of the code...");
    }
}
