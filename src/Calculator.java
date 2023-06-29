    import java.util.Scanner;

    public class Calculator {
        public static void main(String[] args) {
            int number1, number2;

            Scanner scanner = new Scanner(System.in);
            System.out.print("1. sayıyı giriniz :");
            number1 = scanner.nextInt();
            System.out.print("2. sayıyı giriniz :");
            number2 = scanner.nextInt();
            System.out.println("Lütfen yapmak istedğiniz işlemi seçiniz ...");

            System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\nBölme");

            int select =scanner.nextInt();

            switch (select){
                case 1:
                    System.out.println("Toplama sonucu" + (number1 +number2));
                    break;
                case 2:
                    System.out.println("Çıkarma :"+ (number1 -number2) );
                    break;
                case 3:
                    System.out.println("Çarpma :" + + (number1 *number2));
                    break;
                case 4:
                    if (number2!=0) {
                        System.out.println("Bölme :" + (number1 /number2));
                    }
                    else {
                        System.out.println("number2 geçersiz");
                    }
                    break;
                default:
                    System.out.println("Lütfen geçerli bir işlem seçiniz..");
                    }


            }
        }

