
import java.util.Scanner;

public class Proje3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Yapmak istediğiniz işlemi seçin:");
    System.out.println("1. Toplama");
    System.out.println("2. Çıkarma");
    System.out.println("3. Çarpma");
    System.out.println("4. Bölme");

    int seçim = scanner.nextInt();

    double sayı1;

    do {
      System.out.print("İlk sayıyı girin: ");
      sayı1 = scanner.nextDouble();

      if (sayı1 == 0 && seçim == 4) {
        System.out.println("Hata: Bölme işlemi için ilk sayı 0 olamaz. Tekrar deneyin.");
      }

    } while (sayı1 == 0 && seçim == 4);

    double sayı2;

    do {
      System.out.print("İkinci sayıyı girin: ");
      sayı2 = scanner.nextDouble();

      if (sayı2 == 0 && seçim == 4) {
        System.out.println("Hata: Bölme işlemi için ikinci sayı 0 olamaz. Tekrar deneyin.");
      }

    } while (sayı2 == 0 && seçim == 4);

    double sonuç = 0;

    switch (seçim) {
      case 1:
        sonuç = sayı1 + sayı2;
        break;
      case 2:
        sonuç = sayı1 - sayı2;
        break;
      case 3:
        sonuç = sayı1 * sayı2;
        break;
      case 4:
        if (sayı2 != 0) {
          sonuç = sayı1 / sayı2;
        } else {
          System.out.println("Hata: İkinci sayıyı 0'dan farklı bir sayı olarak girin.");
          return;
        }
        break;
      default:
        System.out.println("Geçersiz bir seçim yaptınız.");
        return;
    }

    System.out.println("Sonuç: " + sonuç);

    scanner.close();
  }
}
