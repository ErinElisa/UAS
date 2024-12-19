package Interface;

public class ACBeraksi {
    public static void main(String[] args) {
        AC acRuangan = new AC();
        
        System.out.println("Status AC saat ini: Mati");

        acRuangan.hidupkanAC();
        acRuangan.matikanAC();
        acRuangan.matikanAC();
        acRuangan.hidupkanAC();
        acRuangan.hidupkanAC();

        acRuangan.dinginkanAC();
        acRuangan.panaskanAC();
        acRuangan.panaskanAC();
        acRuangan.dinginkanAC();
        acRuangan.dinginkanAC();
    }
}
