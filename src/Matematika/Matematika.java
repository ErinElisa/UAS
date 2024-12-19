package Matematika;

public class Matematika {
    int hasil;

    void Pertambahan(int a,  int b){
        hasil = a + b; 
        System.out.println("Hasil dari " + a + " + " + b + " = " + hasil);
    }

    void Pengurangan(int a,  int b){
        hasil = a - b; 
        System.out.println("Hasil dari " + a + " - " + b + " = " + hasil);
    }

    void Perkalian(int a,  int b){
        hasil = a * b; 
        System.out.println("Hasil dari " + a + " x " + b + " = " + hasil);
    }

    void Pembagian(int a,  int b){
        hasil = a / b; 
        System.out.println("Hasil dari " + a + " / " + b + " = " + hasil);
    }
}
