package hafta01;









public class methodlarda_overloading {

    static int topla(int a,int b){
        return a+b;
    }

    static int topla(int a,int b,int c){
        return a+b+c;
    }

    static String topla(String a, String b){
        return a+b;
    }

    /*static String topla(int a, int b){
        return Integer.toString(a) + Integer.toString(b);
    }*/ //overload edebilmek içn giriş parametrelerinin farklı olması lazım


    public static void main(String[] args) {
        System.out.println(topla(3,4));
        System.out.println(topla(7,8,9));
        System.out.println(topla("ali","ayşe"));

    }

}
