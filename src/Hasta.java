public class Hasta {
    private int id;
    private String ad;
    private String tcNo;
    private int yas;

    public Hasta(int id, String ad, String tcNo, int yas) {
        this.id = id;
        this.ad = ad;
        this.tcNo = tcNo;
        this.yas = yas;
    }

    // Getter metodları
    public int getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public String getTcNo() {
        return tcNo;
    }

    public int getYas() {
        return yas;
    }

    @Override
    public String toString() {
        return ad + " (TC: " + tcNo + ", Yaş: " + yas + ")";
    }
}