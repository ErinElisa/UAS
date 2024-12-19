package Handphone;

public class HandphoneBeraksi {
    public static void main(String[] args) {
        Handphone hp = new Handphone();

        hp.hidupkan = "Handphone hidup ...";
        hp.lakukanPanggilan = "Kring, kring, kring ... panggilan dilakukan";
        hp.kirimSMS = "Dung, dung ... sms berhasil terkirim";
        hp.matikan = "Handphone mati ...";

        hp.hidupkan();
        hp.lakukanPanggilan();
        hp.kirimSMS();
        hp.matikan();
    }
}
