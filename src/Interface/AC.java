package Interface;

public class AC implements InterfaceAC{
    int statusAC;

    public void hidupkanAC(){
        if(statusAC == KEADAAN_MATI){
            statusAC = KEADAAN_HIDUP;
            System.out.println("Hidupkan AC! --> AC dihidupkan");
        } else {
            System.out.println("Hidupkan AC! --> AC sudah sudah dalam keadaan hidup");
        }
    }

    public void matikanAC(){
        if(statusAC == KEADAAN_HIDUP){
            statusAC = KEADAAN_MATI;
            System.out.println("Matikan AC! --> AC dimatikan");
        } else {
            System.out.println("Matikan AC! --> AC sudah dalam keadaan mati");
        }
    }

    public void dinginkanAC(){
        if(statusAC == KEADAAN_PANAS){
            statusAC = KEADAAN_DINGIN;
            System.out.println("Dinginkan AC! --> AC didinginkan");
        } else {
            System.out.println("DInginkan AC! --> AC sudah dalam keadaan dingin");
        }
    }

    public void panaskanAC(){
        if(statusAC == KEADAAN_DINGIN){
            statusAC = KEADAAN_PANAS;
            System.out.println("Panaskan AC! --> AC dipanaskan");
        } else {
            System.out.println("Panaskan AC! --> AC sudah dalam keadaan panas");
        }
    }
}
