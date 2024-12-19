package Bank;

public class Bank {
    private int saldo;

    public Bank(int saldo){
        this.saldo = saldo;
    }

    public void getSaldo(){
        System.out.println("Welcome to my bank");
        System.out.printf("Saldo saat ini: Rp.%,d\n", saldo);
    }

    public void simpanUang(int simpan){
        if (simpan > 0) {
            saldo += simpan;
            System.out.printf("Anda kirim uang: Rp.%,d\n", simpan);
            System.out.printf("Saldo saat ini: Rp.%,d\n", saldo);
        } else {
            System.out.println("Jumlah yang disimpan harus lebih besar dari nol.");
        }
    }

    public void ambilUang(int ambil){
        if (ambil <= saldo) {
            saldo -= ambil;
            System.out.printf("Ambil uang nominal: Rp.%,d\n", ambil);
            System.out.printf("Saldo saat ini: Rp.%,d\n", saldo);
        } else {
            System.out.printf("Saldo tidak mencukupi untuk menarik uang sebesar: Rp.%,d\n", ambil);
        }
    }
}
