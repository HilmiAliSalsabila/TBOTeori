public class Mangga extends Buah {
    private String nama = "Mangga";
    private String rasa = "Manis";
    private String warna = "Kuning";
    private boolean manis = true;

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public String getRasa() {
        return rasa;
    }

    @Override
    public String getWarna() {
        return warna;
    }

    @Override
    public boolean isManis() {
        return manis;
    }
}
