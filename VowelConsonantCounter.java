import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the string to lowercase for uniformity
        String lowerCaseInput = input.toLowerCase();

        int vowelCount = 0, consonantCount = 0;

        // Iterate through each character in the string
        for (char ch : lowerCaseInput.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') { // Check if the character is a letter
                if (isVowel(ch)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        // Display the results
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

        scanner.close();
    }

    // Method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
