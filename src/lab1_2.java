import java.util.InputMismatchException;
import java.util.Scanner;

public class lab1_2 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int month, day;
        try {
            System.out.print("День: ");
            day = scanner.nextInt();
            System.out.print("Месяц: ");
            month = scanner.nextInt();
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    if (day > 31 || day <= 0) throw new InputMismatchException();
                    break;
                case 4, 6, 9, 11:
                    if (day > 30 || day <= 0) throw new InputMismatchException();
                    break;
                case 2:
                    if (day > 29 || day <= 0) throw new InputMismatchException();
            }

        } catch (InputMismatchException ignored) {
            System.out.println("Неправильный ввод!");
            return;
        }

        String season = switch (month) {
            case 1, 2, 12 -> "зима";
            case 3, 4, 5 -> "весна";
            case 6, 7, 8 -> "лето";
            case 9, 10, 11 -> "осень";
            default -> "Неправильный номер месяца: " + month + "!";
        };
        System.out.println(season);
    }
}