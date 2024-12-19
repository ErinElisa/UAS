package Interface;

public class ACBeraksi {
    public static void main(String[] args) {
        AC acRuangan = new AC();
        
        System.out.println("Status AC saat ini: Mati");

        acRuangan.hidupkan();
        acRuangan.matikan();
        acRuangan.matikan();
        acRuangan.hidupkan();
        acRuangan.hidupkan();
    }
}
