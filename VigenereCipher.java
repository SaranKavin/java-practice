import java.util.Scanner;

public class VigenereCipher {
    public static String encrypt(String text, String key) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = (char) ((text.charAt(i) - 'a' + key.charAt(i % key.length()) - 'a') % 26 + 'a');
            result.append(c);
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the plaintext: ");
        String plaintext = scanner.nextLine().toLowerCase().replaceAll("[^a-z]", "");

        System.out.print("Enter the key: ");
        String key = scanner.nextLine().toLowerCase().replaceAll("[^a-z]", "");

        if (key.isEmpty()) {
            System.out.println("Error: Key cannot be empty.");
            return;
        }

        String encryptedText = encrypt(plaintext, key);
        System.out.println("Vigenere Cipher: " + encryptedText);

        scanner.close();
    }
}
