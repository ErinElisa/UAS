package Mahasiswa;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa ms = new Mahasiswa();

        ms.membaca = "Sedang membaca tugas yang diberikan";
        ms.nyontek = "Sedang melakukan pencontekan";
        ms.modifikasi = "Sedang memodifikasi jawaban dari tugas yang diberikan";

        ms.membaca();
        ms.nyontek();
        ms.modifikasi();
    }
}
