package hafta02_sinif_class_giris;

class Ogrenci{
    String ad;
    String soyad;
    int numara;
    String email;

    void yaz() {
        System.out.println(this.ad);
        System.out.println(this.soyad);
        System.out.println(this.numara);
        System.out.println(this.email);
    }

    String yaz(String ad,String soyad){
        return "İsim = " + ad + " Soyad = " + soyad;
    }
}


public class sinif {
    public static void main(String[] args) {
       Ogrenci o = new Ogrenci();
       //o.yaz(); //değişken değerleri atamadan önce çağrıldı, null yazar
       o.ad = "Ali";
       o.soyad = "Alkan";
       o.numara = 25001;
       o.email = "aa@gmail.com";
       o.yaz();
       String birlesim = o.yaz(o.ad,o.soyad);
       System.out.println(birlesim);

       //System.out.println("İsim ="+o.ad);

       //Ogrenci o2 = new Ogrenci();
       //o2.ad="Betül";

    }
}
