public class Jeruk extends Buah {
    private String nama = "Jeruk";
    private String rasa = "Asam";
    private String warna = "Oranye";
    private boolean manis = false;

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
