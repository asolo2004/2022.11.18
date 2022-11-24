import java.util.InputMismatchException;
import java.util.Scanner;

public class lab1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, k = 0;
        double rad, x, y;
        try {
            System.out.print("Количество точек: ");
            num = scanner.nextInt();
            System.out.print("Радиус окружности: ");
            rad = scanner.nextDouble();
            if (rad < 0 || num < 0)
                throw new InputMismatchException();
            for (int i = 1; i <= num; i++) {
                System.out.printf("X %d точки: ", i);
                x = scanner.nextDouble();
                System.out.printf("Y %d точки: ", i);
                y = scanner.nextDouble();
                if (x * x + y * y <= rad * rad) {
                    k++;
                }
            }
        } catch (InputMismatchException ignored) {
            System.out.println("Неправильный ввод!");
            return;
        }
        System.out.printf("%d точек попали в окружность\n", k);
    }
}
