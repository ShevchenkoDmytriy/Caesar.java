import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text to encrypt:");
        String originalText = scanner.nextLine();

        System.out.println("Enter the shift value for Caesar cipher:");
        int shift = scanner.nextInt();

        String encryptedText = encryptCaesar(originalText, shift);
        System.out.println("Encrypted text: " + encryptedText);

        String decryptedText = decryptCaesar(encryptedText, shift);
        System.out.println("Decrypted text: " + decryptedText);
    }

    public static String encryptCaesar(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                char shifted = (char) (((ch - 'a' + shift) % 26) + 'a');
                result.append(shifted);
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static String decryptCaesar(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                char shifted = (char) (((ch - 'a' - shift + 26) % 26) + 'a');
                result.append(shifted);
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
