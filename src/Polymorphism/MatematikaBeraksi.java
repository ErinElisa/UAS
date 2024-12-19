package Polymorphism;

public class MatematikaBeraksi {
        public static void main(String[] args) {
        MatematikaCanggih mtk = new MatematikaCanggih();

        mtk.pertambahan(23, 34);
        mtk.pertambahan(3.4, 4.9);
        mtk.pertambahan(12, 28, 14);
        mtk.pertambahan(12.5, 28.7, 14.2);


        // Kurang
        mtk.pengurangan(23, 34);
        mtk.pengurangan(3.4, 4.9);
        mtk.pengurangan(12, 28, 14);
        mtk.pengurangan(12.5, 28.7, 14.2);


        // Kali
        mtk.perkalian(23, 34);
        mtk.perkalian(3.4, 4.9);
        mtk.perkalian(12, 28, 14);
        mtk.perkalian(12.5, 28.7, 14.2);


        // Bagi
        mtk.pembagian(23, 34);
        mtk.pembagian(3.4, 4.9);
        mtk.pembagian(12, 28, 14);
        mtk.pembagian(12.5, 28.7, 14.2);
        

        // Modulus
        mtk.modulus(23, 34);
        mtk.modulus(3.4, 4.9);
        mtk.modulus(12, 28, 14);
        mtk.modulus(12.5, 28.7, 14.2);
    }
}
