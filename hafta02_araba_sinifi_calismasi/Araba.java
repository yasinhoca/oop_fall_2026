package hafta02_araba_sinifi_calismasi;

public class Araba {
    String marka,model;
    int uretim_yili;
    float agirlik;
    String plaka;



    void soforAta(String ad){
        String atanan = this.plaka + " - " + ad;
        System.out.println(atanan);
    }
}
