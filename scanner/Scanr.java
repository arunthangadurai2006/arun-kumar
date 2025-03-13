import java.util.Scanner;

class Scanr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); 

        System.out.println("You entered the age: " + age);

        scanner.close(); 
    }
}
