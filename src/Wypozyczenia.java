public class Wypozyczenia {
    private int idKsiazki;
    private int idCzytelnika;
    private String dataWypozyczenia;
    private String dataZwrotu;

    public Wypozyczenia(int idKsiazki, int idCzytelnika, String dataWypozyczenia){
        this.idKsiazki = idKsiazki;
        this.idCzytelnika = idCzytelnika;
        this.dataWypozyczenia = dataWypozyczenia;
    }

    public int getIdKsiazki() {
        return idKsiazki;
    }

    public int getIdCzytelnika() {
        return idCzytelnika;
    }

    public String getDataWypozyczenia() {
        return dataWypozyczenia;
    }

    public String getDataZwrotu() {
        return dataZwrotu;
    }

    public void setDataZwrotu(String dataZwrotu) {
        this.dataZwrotu = dataZwrotu;
    }

    @Override
    public String toString() {
        return idKsiazki + ", " + idCzytelnika + ", " + dataWypozyczenia + ", " + dataZwrotu;
    }
}
