package hafta02_constructer_methodlar;

public class Ucgen {
    //global değişkenler
    int taban,yukseklik;
    int a,b,c;



    //constructer - yapıcı method sınıf ismi birebir aynı olmalı
    Ucgen(){
        this.taban=4;
        this.yukseklik=3;
    }

    //constructerları overload edebiliriz
    Ucgen(int taban,int yukseklik){
        this.taban = taban;
        this.yukseklik = yukseklik;
    }


    float ucgenAlanı(){
        return ((float)this.taban*this.yukseklik)/2;
    }

}
