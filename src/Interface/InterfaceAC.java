package Interface;

interface InterfaceAC {
    public static final int KEADAAN_HIDUP = 1;
    public static final int KEADAAN_MATI = 0;
    public static final int KEADAAN_PANAS = 1;
    public static final int KEADAAN_DINGIN = 0;

    public abstract void hidupkanAC();
    public abstract void matikanAC();
    public abstract void dinginkanAC();
    public abstract void panaskanAC();
}
