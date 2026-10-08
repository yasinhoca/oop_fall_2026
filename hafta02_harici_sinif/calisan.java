package hafta02_harici_sinif;

public class calisan {
    public static void main(String[] args) {
        Hacim h = new Hacim();
        h.kenar = 3f; // (float) 3;
        System.out.println(h.kupHacmi());
        h.en=3;
        h.boy=4;
        h.yukseklik=5;
        System.out.println(h.kutu());
        h.yaricap = 6;
        h.yukseklik = 8;
        System.out.println(h.silindirHacmi());
        h.yaricap = 5;
        h.yukseklik = 6;
        System.out.println(h.koniHacmi());

    }
}
