import java.util.Scanner;
public class Vow{
    public static void main(String[] args) {
        // Array of vowels
        String[] vowels = {"a", "e", "i", "o", "u"};

        // Scanner to take user input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String answer = input.next(); 

        
        int i = 0;
        boolean isVowel = false; 
        while (i < vowels.length) {
            if (vowels[i].equalsIgnoreCase(answer)) { 
                isVowel = true;
                break;
            }
            i++;
        }

        
        if (isVowel) {
            System.out.println("The letter '" + answer + "' is a vowel.");
        } else {
            System.out.println("The letter '" + answer + "' is not a vowel.");
        }

        input.close();
    }
}
