public class upper {
    public static void main(String[] args) {
        String original = "Hello World";
        String upperCase = original.toUpperCase();
        String lowerCase = original.toLowerCase();
        System.out.println("Original: " + original);
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Lowercase: " + lowerCase);
        System.out.println("Is original equal to uppercase? " + original.equals(upperCase));
        System.out.println("Is original equal to lowercase? " + original.equals(lowerCase));
    }
}
