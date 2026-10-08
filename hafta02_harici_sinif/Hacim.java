package hafta02_harici_sinif;

public class Hacim {
    double kenar;
    double en,boy,yukseklik;
    double yaricap;




    double kupHacmi(){
        return Math.pow(this.kenar,3);
    }

    double kutu(){
        return this.en*this.boy*this.yukseklik;
    }

    double silindirHacmi(){
        return Math.PI*Math.pow(this.yaricap,2)*this.yukseklik;
    }

    double koniHacmi(){
        return silindirHacmi()/3;
    }


}
