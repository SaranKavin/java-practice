import java.util.Scanner;
public class Monoalphabetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "abcdefghijklmnopqrstuvwxyz", k = "qwertyuiopasdfghjklzxcvbnm";
        System.out.print("Enter text: ");
        String text = sc.nextLine(), result = "";
        for (char c : text.toCharArray()) 
            result += (Character.isLetter(c)) ? k.charAt(a.indexOf(Character.toLowerCase(c))) : c;
        System.out.println("Ciphertext: " + result);
    }
}
