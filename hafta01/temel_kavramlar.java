package hafta01;









public class temel_kavramlar {

    static void yaz(){
        System.out.println("Ben yaz methodu ile yazıldım");
        //cagir();  sonsuz döngüye girer
    }

    static void cagir(){
        yaz();
    }

    static int topla(int a,int b){
        return a+b;
    }

    static String hosgeldin(String isim){
        return isim + " hoşgeldin";
    }

    public static void main(String[] args) {
        cagir();
        System.out.println(topla(5,8));
        System.out.println(hosgeldin("Ahmet"));
    }

}
