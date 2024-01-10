import java.util.Scanner;

public class Proje7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Büyüktoplam = 0;
        int Küçüktoplam = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". sayıyı girin (0-100 arasında olmak şartı ile): ");
            int sayı = scanner.nextInt();

            if (sayı >= 0 && sayı <= 100) {
                if (sayı >= 50) {
                  Büyüktoplam += sayı;
                } else {
                  Küçüktoplam+= sayı;
                }
            } else {
                System.out.println(" Lütfen 0-100 arasında bir sayı girin.");
                i--; 
            }
        }

        double oran = (Büyüktoplam > 0) ? (double) Küçüktoplam / Büyüktoplam : 0;

        System.out.println("50 ve üstü sayıların toplamı: " + Büyüktoplam);
        System.out.println("50'den küçük sayıların toplamı: " + Küçüktoplam);
        System.out.println("Sayıların oranı: " + oran);

        scanner.close();
    }
}
