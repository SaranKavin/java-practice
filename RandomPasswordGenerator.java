import java.security.SecureRandom;

public class RandomPasswordGenerator {
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+<>?";

    private static final String ALL_CHARACTERS = LOWERCASE + UPPERCASE + DIGITS + SPECIAL_CHARACTERS;

    public static String generatePassword(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder(length);

        // Ensure at least one character of each type
        password.append(LOWERCASE.charAt(random.nextInt(LOWERCASE.length())));
        password.append(UPPERCASE.charAt(random.nextInt(UPPERCASE.length())));
        password.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
        password.append(SPECIAL_CHARACTERS.charAt(random.nextInt(SPECIAL_CHARACTERS.length())));

        // Fill the remaining length with random characters from all categories
        for (int i = 4; i < length; i++) {
            password.append(ALL_CHARACTERS.charAt(random.nextInt(ALL_CHARACTERS.length())));
        }

        // Shuffle the password to ensure randomness
        return shuffleString(password.toString());
    }

    private static String shuffleString(String input) {
        SecureRandom random = new SecureRandom();
        StringBuilder shuffled = new StringBuilder(input);

        for (int i = 0; i < shuffled.length(); i++) {
            int j = random.nextInt(shuffled.length());
            char temp = shuffled.charAt(i);
            shuffled.setCharAt(i, shuffled.charAt(j));
            shuffled.setCharAt(j, temp);
        }

        return shuffled.toString();
    }

    public static void main(String[] args) {
        int passwordLength = 12; // Set the length of the password
        String password = generatePassword(passwordLength);

        System.out.println("Generated password: " + password);
    }
}
