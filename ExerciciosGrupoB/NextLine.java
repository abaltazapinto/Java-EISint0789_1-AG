import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Consume the leftover newline
        scanner.nextLine();

        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        System.out.println("You entered: " + number + " and \"" + text + "\"");
        scanner.close();
    }
}
