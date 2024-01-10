import java.util.Scanner;
import java.util.Random;

public class Proje1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        int rastgeleSayi = random.nextInt(100) + 1;

        System.out.println("1 ile 100 arasında bir sayı seçildi. Tahmininizi yapın.");

        int tahmin;
        int denemeSayisi = 0;

        do {
            System.out.print("Tahmininiz: ");
            tahmin = scanner.nextInt();
            denemeSayisi++;

            if (tahmin > rastgeleSayi) {
                System.out.println("Daha küçük bir sayı girin.");
            } else if (tahmin < rastgeleSayi) {
                System.out.println("Daha büyük bir sayı girin.");
            } else {
                if (denemeSayisi == 1) {
                    System.out.println("Tebrikler! İlk seferde sayıyı doğru tahmin ettiniz.");
                } else {
                    System.out.println("Tebrikler! Sayıyı " + denemeSayisi + " denemede buldunuz.");
                }
            }
        } while (tahmin != rastgeleSayi);

        scanner.close();
    }
}
