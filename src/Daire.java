            import java.util.Scanner;

            public class Daire {
                public static void main(String[] args) {

                    int r;
                    double alan, cevre, pi =3.14;

                    Scanner scanner = new Scanner(System.in);

                    System.out.print("Yarıçapı giriniz :");
                    r =scanner.nextInt();

                    alan =pi*(r*r);
                    cevre =2*pi*r;
                    System.out.println("AlAN " + alan);
                    System.out.println("ÇEVRE " + cevre);
                }
            }
