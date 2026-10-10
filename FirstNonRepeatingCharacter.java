import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        Map<Character, Integer> frequency = new LinkedHashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        boolean found = false;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (frequency.get(ch) == 1) {
                System.out.println("First non-repeating character: '" + ch + "'");
                found = true;
                break;
            }
        }

        if (!found) System.out.println("No non-repeating character found.");
        sc.close();
    }
}