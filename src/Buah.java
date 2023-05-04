public abstract class Buah {
    public abstract String getNama();

    public abstract String getRasa();

    public abstract String getWarna();

    public abstract boolean isManis();

    public void infoBuah() {
        System.out.println("Nama : " + getNama());
        System.out.println("Rasa : " + getRasa());
        System.out.println("Warna : " + getWarna());
        System.out.println("Manis : " + isManis());
    }
}
