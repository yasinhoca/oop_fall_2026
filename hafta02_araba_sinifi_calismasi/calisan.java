package hafta02_araba_sinifi_calismasi;

public class calisan {
    public static void main(String[] args) {
        Araba a = new Araba();
        a.marka = "Ford";
        a.model = "Mustang";
        a.uretim_yili = 1980;
        a.agirlik = 1800;
        a.plaka = "42VB007";
        a.soforAta("Volkan Bal");
    }
}
