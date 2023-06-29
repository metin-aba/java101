import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {

        int number,sum=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("lütfen sayıyı giriniz :");
        number =scanner.nextInt();

        for (int i = 0; i < number; i++) {
            if (!(i%2 == 0)) {
                sum+=i;
                System.out.println(i);
            }

        }
        System.out.println(sum);

    }
}
