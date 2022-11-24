import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.util.InputMismatchException;
import java.util.Scanner;

public class lab1_1 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        int days, month, years;
        try {
            System.out.print("Введите день рождения: ");
            days = scanner.nextInt();
            System.out.print("Введите месяц рождения: ");
            month = scanner.nextInt();
            System.out.print("Введите год рождения: ");
            years = scanner.nextInt();
        } catch (InputMismatchException ignored) {
            System.out.println("Неправильный ввод!");
            return;
        }

        LocalDate now = LocalDate.now();
        LocalDate birthday;
        try {
            birthday = LocalDate.of(years, month, days);
        } catch (DateTimeException ignored) {
            System.out.println("Неверные значения даты!");
            return;
        }
        Period period = Period.between(birthday, now);
        System.out.printf("%d лет, %d месяцев и %d дней\n", period.getYears(), period.getMonths(), period.getDays());

        scanner.close();
    }
}
