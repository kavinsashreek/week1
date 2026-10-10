import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of people in the team: ");
        int count = sc.nextInt();
        sc.nextLine();

        String[] names = new String[count];
        double[] bmis = new double[count];
        String[] status = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter name of person " + (i + 1) + ": ");
            names[i] = sc.nextLine();
            System.out.print("Enter weight in kg: ");
            double weight = sc.nextDouble();
            System.out.print("Enter height in metres: ");
            double height = sc.nextDouble();
            sc.nextLine();

            bmis[i] = weight / (height * height);
            if (bmis[i] < 18.5) status[i] = "Underweight";
            else if (bmis[i] < 25) status[i] = "Normal";
            else if (bmis[i] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("\n--- Team BMI Report ---");
        System.out.printf("%-20s %-10s %s%n", "Name", "BMI", "Status");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-20s %-10.2f %s%n", names[i], bmis[i], status[i]);
        }
        sc.close();
    }
}