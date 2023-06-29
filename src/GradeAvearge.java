import java.util.Scanner;

public class GradeAvearge {
    public static void main(String[] args) {
        int mat, fen, turkce, sosyal;
        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz :");
        mat = scan.nextInt();
        System.out.print("Fen notunuzu giriniz :");
        fen = scan.nextInt();
        System.out.print("Türkçe notunuzu giriniz :");
        turkce = scan.nextInt();
        System.out.print("Sosyal notunuzu giriniz :");
        sosyal = scan.nextInt();

        double sonuc = (mat +fen + turkce +sosyal)/4;

        System.out.println("Sonuç :" + sonuc);


    }
}
