public class Proje19 {

    private static Proje19 instance;
    private String isim;
    private String cins;
    private String renk;
    private Proje19(String isim, String renk, String cins) {
        this.renk = renk;
        this.isim = isim;
        this.cins = cins;
    }
    public static Proje19 getInstance(String isim, String renk, String cins) {
        if (instance == null) {
            instance = new Proje19(isim, renk, cins);
        }
        return instance;
    }
    public void Bilgi(String isim, String renk, String cins) {
        this.isim = isim;
        this.cins = cins;
        this.renk = renk; 
    }
    public void IsımRenk(String isim, String renk) {
        this.isim = isim;
        this.renk = renk;
    }
     public static String PazarYerlerTur() {
        return "Belirsiz !!!";
    }
    public String IsımGetir() {
        return isim;
    }
    public String RenkGetir() {
        return renk;
    }
    public String SahipGetir() {
        return cins;
}

}