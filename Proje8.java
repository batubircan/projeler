public class Proje8 {
    public static void main(String[] args) {
        int n = 20;
      
        int[] Fibanacisayıları= new int[n];

        Fibanacisayıları[0] = 0;
      
        Fibanacisayıları[1] = 1;

        for (int i = 2; i < n; i++) {
          
          Fibanacisayıları[i] = Fibanacisayıları[i - 1] + Fibanacisayıları[i - 2];
        }

        System.out.println("Fibonacci serisi (ilk " + n + " sayı):");
      
        for (int i = 0; i < n; i++) {
          
            System.out.print(Fibanacisayıları[i] + " ");
          
        }
    }
}
