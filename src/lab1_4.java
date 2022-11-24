import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class lab1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, n;
        try {
            System.out.print("x: ");
            x = scanner.nextInt();
            System.out.print("n: ");
            n = scanner.nextInt();

        } catch (InputMismatchException ignored) {
            System.out.println("Неправильный ввод!");
            return;
        }
        if (n == 0)
            System.out.println("1");
        else if (n > 0) {
            BigInteger m = BigInteger.valueOf(1);
            BigInteger bigX = BigInteger.valueOf(x);
            for (int i = 0; i < n; i++) {
                m = m.multiply(bigX);
            }
            System.out.println(m);
        } else {
            double m = 1;
            for (int i = 0; i < -n; i++) {
                m /= x;
            }
            System.out.println(m);
        }
    }


}

