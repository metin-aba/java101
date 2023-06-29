import java.util.Scanner;

public class IkininKuvetleri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("sayı giriniz :");
        int number = scanner.nextInt();

        for (int i = 1; i < number; i*=2) {

            System.out.println(i);
        }
    }
}
