import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number = number / 10; 
        }
     System.out.println("Sum of the digits: " + sum);
    }
}
