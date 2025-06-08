public class Doktor {
    private int id;
    private String ad;
    private String uzmanlik;

    public Doktor(int id, String ad, String uzmanlik) {
        this.id = id;
        this.ad = ad;
        this.uzmanlik = uzmanlik;
    }

    // Getter metodları
    public int getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public String getUzmanlik() {
        return uzmanlik;
    }

    @Override
    public String toString() {
        return "Dr. " + ad + " (" + uzmanlik + ")";
    }
}