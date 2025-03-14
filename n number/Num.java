import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many numbers sum (n): ");
        int n = scanner.nextInt();

        int sum = 0;
        System.out.println(  n);

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            sum += num;
        }

        System.out.println("The sum of the " + n + " numbers is: " + sum);

        scanner.close();
    }
}
