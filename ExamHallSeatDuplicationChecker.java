import java.util.Scanner;

public class ExamHallSeatDuplicationChecker {
    static void checkDuplicateSeats(int[] seatNumbers) {
        boolean found = false;

        for (int i = 0; i < seatNumbers.length; i++) {
            boolean alreadyReported = false;
            for (int k = 0; k < i; k++) {
                if (seatNumbers[k] == seatNumbers[i]) {
                    alreadyReported = true;
                    break;
                }
            }
            if (alreadyReported) continue;

            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    found = true;
                    break;
                }
            }
        }

        if (!found) System.out.println("No Duplicate Seats Found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of seats: ");
        int n = sc.nextInt();
        int[] seats = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter seat number " + (i + 1) + ": ");
            seats[i] = sc.nextInt();
        }

        checkDuplicateSeats(seats);
        sc.close();
    }
}