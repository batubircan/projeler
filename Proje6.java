import java.util.Scanner;

public class Proje6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Enbüyüksayı = Integer.MIN_VALUE;
        int Sayısırası = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ". sayıyı girin: ");
            int sayı = scanner.nextInt();

            if (sayı > Enbüyüksayı) {
                Enbüyüksayı = sayı;
                Sayısırası = i;
            }
        }

        System.out.println("En büyük sayı: " + Enbüyüksayı);
        System.out.println("Girildiği sıra: " + Sayısırası);

        scanner.close();
    }
}
