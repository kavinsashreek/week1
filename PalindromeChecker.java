import java.util.Scanner;

public class PalindromeChecker {
    static boolean iterative(String text) {
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    static boolean recursive(String text, int left, int right) {
        if (left >= right) return true;
        if (text.charAt(left) != text.charAt(right)) return false;
        return recursive(text, left + 1, right - 1);
    }

    static boolean arrayReversal(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        return new String(original).equals(new String(reversed));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or text: ");
        String text = sc.nextLine();

        System.out.println("Iterative: " + (iterative(text) ? "Palindrome" : "Not a palindrome"));
        System.out.println("Recursive: " + (recursive(text, 0, text.length() - 1) ? "Palindrome" : "Not a palindrome"));
        System.out.println("Array reversal: " + (arrayReversal(text) ? "Palindrome" : "Not a palindrome"));
        sc.close();
    }
}