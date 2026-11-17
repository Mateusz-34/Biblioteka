public class Ksiazka {
    private int id;
    private String tytul;
    private String autor;
    private int rokWydania;
    private String kategoria;
    private boolean czyWypozyczona;

    public Ksiazka(int id, String tytul, String autor, int rokWydania, String kategoria, boolean czyWypozyczona){
        this.id = id;
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
        this.kategoria = kategoria;
        this.czyWypozyczona = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public boolean isCzyWypozyczona() {
        return czyWypozyczona;
    }

    public void setCzyWypozyczona(boolean czyWypozyczona) {
        this.czyWypozyczona = czyWypozyczona;
    }

    @Override
    public String toString(){
        return id + ", " + tytul + ", " + autor + ", " + rokWydania + ", " + kategoria + ", " + czyWypozyczona;
    }
}
