package Interface;

public class AC implements InterfaceAC{
    int statusAC;

    public void hidupkan(){
        if(statusAC == KEADAAN_MATI){
            statusAC = KEADAAN_HIDUP;
            System.out.println("Hidupkan AC! --> AC dihidupkan");
        } else {
            System.out.println("Hidupkan AC! --> AC sudah sudah dalam keadaan hidup");
        }
    }

    public void matikan(){
        if(statusAC == KEADAAN_HIDUP){
            statusAC = KEADAAN_MATI;
            System.out.println("Matikan AC! --> AC dimatikan");
        } else {
            System.out.println("Matikan AC! --> AC sudah dalam keadaan mati");
        }
    }
}
