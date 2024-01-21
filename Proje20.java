import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Proje20{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum gününüzü (GG.AA.YYYY formatında) giriniz: ");
        String dogumGunTarihiStr = scanner.nextLine();

        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy", new Locale("tr"));

        try {
          
            LocalDate dogumGunTarihi = LocalDate.parse(dogumGunTarihiStr, formatter);

            
            DayOfWeek gun = dogumGunTarihi.getDayOfWeek();

            
            String gunAdi = gun.getDisplayName(java.time.format.TextStyle.FULL, new Locale("tr"));

            
            System.out.println("Doğduğunuz gün: " + gunAdi);
        } catch (Exception e) {
            System.out.println("Geçersiz tarih formatı! Lütfen GG.AA.YYYY formatında doğru bir tarih girin.");
        } finally {
            scanner.close();
        }
    }
}
