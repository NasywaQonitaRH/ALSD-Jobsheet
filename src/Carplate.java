import java.util.Scanner;

public class Carplate {
    public static void main(String[] args) {
        char[] CODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        String[] CITY = {
            "BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR",
            "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter car plate code: ");
        char input = scanner.next().toUpperCase().charAt(0);

        boolean found = false;
        for (int i = 0; i < CODE.length; i++) {
            if (input == CODE[i]) {
                System.out.println("City: " + CITY[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Invalid car plate code!");
        }

        scanner.close();
    }
}