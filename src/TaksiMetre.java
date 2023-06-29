import java.util.Scanner;

public class TaksiMetre {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total, startPrice = 10;

        Scanner scanner = new Scanner(System.in);

        System.out.print(" KM' yi griniz :");
        km =scanner.nextInt();

        total = (km*perKm);
        total +=startPrice;

        total =(total<20)? 20 : total;
        System.out.println("Toplam :" +total);
    }
}
