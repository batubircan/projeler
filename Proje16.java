import java.util.Scanner;

public class Proje16{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Lütfen bir metin girin: ");
        String metin = scanner.nextLine();

        System.out.print("Lütfen sayısını öğrenmek istediğiniz harfi girin: ");
        char harf = scanner.next().toLowerCase().charAt(0); 

        
        int harfSayisi = harfSayisiniBul(metin, harf);
        System.out.println("Girilen harf \"" + harf + "\", metin içinde " + harfSayisi + " kez bulunmaktadır.");

        
        scanner.close();
    }

    private static int harfSayisiniBul(String metin, char harf) {
        int sayac = 0;

        
        for (int i = 0; i < metin.length(); i++) {
            if (Character.toLowerCase(metin.charAt(i)) == harf) { 
                sayac++;
            }
        }

        return sayac;
    }
}
