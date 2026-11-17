public class Czytelnik {
    private int id;
    private String nazwisko;
    private int numerKarty;
    private String adresEmail;

    public Czytelnik(int id, String nazwisko, int numerKarty, String adresEmail){
        this.id = id;
        this.nazwisko = nazwisko;
        this.numerKarty = numerKarty;
        this.adresEmail = adresEmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdresEmail() {
        return adresEmail;
    }

    public void setAdresEmail(String adresEmail) {
        this.adresEmail = adresEmail;
    }

    public int getNumerKarty() {
        return numerKarty;
    }

    public void setNumerKarty(int numerKarty) {
        this.numerKarty = numerKarty;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return id + ", " + nazwisko + ", " + numerKarty + ", " + adresEmail;
    }
}
