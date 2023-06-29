import java.util.Arrays;
import java.util.Scanner;

public class AmstrongSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int gecici = sayi;
        int basamakSayisi = String.valueOf(sayi).length();
        int toplam = 0;

        while (gecici != 0) {
            int basamak = gecici % 10;
            toplam += Math.pow(basamak, basamakSayisi);
            gecici /= 10;
        }

        if (toplam == sayi) {
            System.out.println(sayi + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(sayi + " bir Armstrong sayısı değildir.");
        }

        print(2);
    }
    static  void print(int a){
        System.out.println("kjvnd");
    }
}
