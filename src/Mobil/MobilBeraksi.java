package Mobil;

public class MobilBeraksi {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();

        mobil.warna = "merah";
        mobil.tahunProduksi = 1980;
        System.out.println("Mobilku berwarna: " + mobil.warna);
        System.out.println("Mobilku dibuat tahun: " + mobil.tahunProduksi);
    }
}
