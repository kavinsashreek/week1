import java.util.Scanner;

public class ReverseCustomerName {
    static String reverseName(String name) {
        return new StringBuilder(name).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.println("Original name: " + name);
        System.out.println("Reversed name: " + reverseName(name));
        sc.close();
    }
}