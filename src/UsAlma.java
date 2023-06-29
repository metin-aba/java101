import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" üs sayı :");
        int us = scanner.nextInt();
        System.out.print(" taban sayı :");
        int taban = scanner.nextInt();
        //2^3 =2*2*2
        int sayi=1;
        for (int i = 0; i < us; i++) {

             sayi*=taban;

           // System.out.println(number1);

        }
        System.out.println(sayi);
    }
}
