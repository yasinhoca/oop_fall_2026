package hafta01;


import java.util.ArrayList;
import java.util.Random;

public class asal_sayi_ornek {
    static boolean asalMi(int a){
        int bolenSayac=0;

        if(a==0 || a==1) return false;
        else {

            for (int i = 2; i < a; i++) {
                if (a % i == 0) bolenSayac++;
            }
            if (bolenSayac == 0) return true;
            else return false;
        }
    }

    static int buyukAsal(int a){
        int bulunan=0;
        while (true){
            a++;
            if(asalMi(a)) {
                bulunan=a;
                break;
            }
        }
        return bulunan;
    }

    static ArrayList asallar(int a,int b){
        ArrayList<Integer> liste = new ArrayList<>();
        for(int i=a;i<=b;i++){
            if(asalMi(i)) liste.add(i);
        }
        return liste;
    }

    static ArrayList rastAsallar(int a,int b,int l){
        ArrayList<Integer> liste = new ArrayList<>();
        ArrayList<Integer> aralik = asallar(a,b);
        System.out.println(aralik);
        Random r = new Random();
        for(int i=0;i<l;i++) {
            liste.add(aralik.get(r.nextInt(aralik.size())));
        }
        return liste;
    }


    public static void main(String[] args) {
        System.out.println(asalMi(14));
        System.out.println(asalMi(107));

        System.out.println(buyukAsal(50));
        System.out.println(asallar(100,1000));

        System.out.println(rastAsallar(0,20,40));
    }
}
