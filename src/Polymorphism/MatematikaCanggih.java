package Polymorphism;

public class MatematikaCanggih extends Matematika {

    void modulus(int a, int b) {
        int hasil = a % b;
        System.out.println("Hasil dari " + a + " % " + b + " = " + hasil);
    }

    void modulus(double a, double b){
        double hasil = a % b;
        System.out.println("Hasil dari " + a + " % " + b + " = " + hasil);
    }

    void modulus(int a, int b, int c){
        int hasil = a % b % c;
        System.out.println("Hasil dari " + a + " % " + b + " % " + c + " = " + hasil);
    }

    void modulus(double a, double b, double c){
        double hasil = a % b % c;
        System.out.println("Hasil dari " + a + " % " + b + " % " + c + " = " + hasil);
    }
}
