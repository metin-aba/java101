import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        int a, b;
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. kenarı giriniz :");
        a = scanner.nextInt();

        System.out.print("2. kenarı giriniz :");
        b = scanner.nextInt();

        c = Math.sqrt((a*a) +(b*b));

        System.out.println(c);

    }
}
