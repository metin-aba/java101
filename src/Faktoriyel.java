import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı gir :");
        int sayi = scanner.nextInt();

        int fakt =1;

            for (int i = 1; i <= sayi; i++) {

                fakt=fakt*i;

            }
            System.out.println(fakt);

    }
}
