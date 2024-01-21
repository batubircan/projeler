public class Proje12 {
    public static void main(String[] args) {
        String Kelime = "Programlama";
        int Harf = 12;

        for (int i = 0; i < Harf; i++) {
            String Kaydır = Kelime.substring(i) + Kelime.substring(0, i);
            System.out.println(" - " + Kaydır);
        }
    }
}