import java.util.Random;
import java.util.Scanner;

public class OneTimePad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter plaintext: ");
        String plaintext = scanner.nextLine().toUpperCase(); 

        Random rand = new Random();
        StringBuilder ciphertext = new StringBuilder();

        for (char c : plaintext.toCharArray()) {
            if (c < 'A' || c > 'Z') {
                System.out.println("Invalid character found: " + c);
                return;
            }
            int key = rand.nextInt(26); 
            char encryptedChar = (char) ('A' + (c - 'A' + key) % 26);
            ciphertext.append(encryptedChar);
        }

        System.out.println("Ciphertext: " + ciphertext);
        scanner.close();
    }
}
