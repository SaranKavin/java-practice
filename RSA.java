import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Scanner;

public class RSA {
    private BigInteger privateKey, publicKey, modulus;

    // Constructor to generate keys
    public RSA(int bitLength) {
        SecureRandom random = new SecureRandom();
        BigInteger p = new BigInteger(bitLength / 2, 100, random);
        BigInteger q = new BigInteger(bitLength / 2, 100, random);
        modulus = p.multiply(q);
        BigInteger phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        publicKey = new BigInteger("65537"); // Common public key exponent
        privateKey = publicKey.modInverse(phi);
    }

    // Encrypt a message
    public BigInteger encrypt(String message) {
        byte[] bytes = message.getBytes();
        return new BigInteger(bytes).modPow(publicKey, modulus);
    }

    // Decrypt a message
    public String decrypt(BigInteger encrypted) {
        BigInteger decrypted = encrypted.modPow(privateKey, modulus);
        return new String(decrypted.toByteArray());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphanumeric message to encrypt: ");
        String message = scanner.nextLine();

        RSA rsa = new RSA(1024); // 1024-bit keys
        BigInteger encrypted = rsa.encrypt(message);
        String decrypted = rsa.decrypt(encrypted);

        System.out.println("Original: " + message);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
