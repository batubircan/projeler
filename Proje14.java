import java.util.Scanner;

public class Proje14{
    public static void main(String[] args) {
        
        int ilkGun = alGunu("İlk günü giriniz: ");
        int ilkAy = alAyı("İlk ayı giriniz: ");
        int ilkYil = alSayi("İlk yılı giriniz: ");

        
        int ikinciGun = alGunu("İkinci günü giriniz: ");
        int ikinciAy = alAyı("İkinci ayı giriniz: ");
        int ikinciYil = alSayi("İkinci yılı giriniz: ");

        
        if (!tarihgeçerlimi(ilkGun, ilkAy)) {
          hatamesajı("Hatalı tarih girişi İlk tarih geçerli değil.");
            return;
        }

        if (!tarihgeçerlimi(ikinciGun, ikinciAy)) {
          hatamesajı("Hatalı tarih girişi İkinci tarih geçerli değil.");
            return;
        }

        
        int farkGun = ikinciGun - ilkGun;
        int farkAy = ikinciAy - ilkAy;
        int farkYil = ikinciYil - ilkYil;

        
        System.out.println("Tarih Farkı:");
        System.out.println("Gün: " + farkGun);
        System.out.println("Ay: " + farkAy);
        System.out.println("Yıl: " + farkYil);
    }

    private static int alGunu(String prompt) {
        Scanner scanner = new Scanner(System.in);
        int gun;
        do {
            System.out.print(prompt);
            gun = scanner.nextInt();
            if (gun <= 0 || gun > 31) {
              hatamesajı("Girdiğiniz gün geçersiz Lütfen uygun bir gün girin.");
            }
        } while (gun <= 0 || gun > 31);
        return gun;
    }

    private static int alAyı(String prompt) {
        Scanner scanner = new Scanner(System.in);
        int ay;
        do {
            System.out.print(prompt);
            ay = scanner.nextInt();
            if (ay <= 0 || ay > 12) {
              hatamesajı("Girdiğiniz ay geçersiz Lütfen uygun bir ay girin.");
            }
        } while (ay <= 0 || ay > 12);
        return ay;
    }

    private static int alSayi(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private static boolean tarihgeçerlimi(int gun, int ay) {
        if ((ay == 4 || ay == 6 || ay == 9 || ay == 11) && gun > 30) {
            return false;
        } else if (ay == 2) {
            return gun > 0 && gun <= 28;
        } else {
            return gun > 0 && gun <= 31;
        }
    }

    private static void hatamesajı(String mesaj) {
        System.out.println("Hata: " + mesaj);
    }
}
