import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);

        double fiyat , kdvOran , kdvTutar , kdvliTutar ;

        System.out.print("Ürün Fiyatı   : ₺");
        fiyat = inp.nextDouble();

        boolean kosul = fiyat >= 1000;
        kdvOran = kosul ? 0.08 :  0.18 ;

        kdvTutar = ( fiyat * kdvOran);
        kdvliTutar = ( kdvTutar + fiyat );

        System.out.println("KDV'siz Fiyat : ₺" + fiyat );
        System.out.println("KDV'li Fiyat  : ₺" + kdvliTutar );
        System.out.println("KDV Oranı     : %" + kdvOran * 100);
        System.out.println("KDV Tutarı    : ₺"  + kdvTutar );
    }
    }
