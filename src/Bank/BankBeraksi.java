package Bank;

public class BankBeraksi {
    public static void main(String[] args) {
        Bank bk = new Bank(100000);

        bk.getSaldo();
        bk.simpanUang(50000);
        bk.ambilUang(1000000);
    }
}
