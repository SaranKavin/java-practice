import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the string using a custom method
        String reversedString = reverseString(input);

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        char[] chars = str.toCharArray(); // Convert the string to a character array
        int start = 0, end = chars.length - 1;

        while (start < end) {
            // Swap the characters at the start and end indices
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            // Move the indices towards the center
            start++;
            end--;
        }

        return new String(chars); // Convert the character array back to a string
    }
}
