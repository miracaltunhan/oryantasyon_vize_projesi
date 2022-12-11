package odev;
// bölme işlemleinde bölüm ve kalanı gösteren algoritma
public class odev4 {

    public static void main(String[] args) {

        int sayi = 27, bolen = 9;

        int bolum = sayi / bolen;
        int kalan = sayi % bolen;

        System.out.println("İşlem:"+sayi+"/"+bolen);
        System.out.println("Bölüm = " + bolum);
        System.out.println("Kalan = " + kalan);
    }
}
