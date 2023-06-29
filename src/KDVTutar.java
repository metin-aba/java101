import java.util.Scanner;

public class KDVTutar {
    public static void main(String[] args) {
        double tutar, oran =0.18, kdvTutar, kdvliTutar;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Tutar giriniz :");
        tutar = scanner.nextDouble();

        kdvTutar =tutar * oran;

        kdvliTutar = tutar + kdvTutar;

        System.out.println("tutar :" + tutar);
        System.out.println("kdv li tutar :" + kdvliTutar);
        System.out.println("kdv :" + kdvTutar);
        System.out.println("oran :" + oran);
    }
}
