public class Randevu {
    private static int sayac = 1;
    private int id;
    private Doktor doktor;
    private Hasta hasta;
    private String tarih;

    public Randevu(Doktor doktor, Hasta hasta, String tarih) {
        this.id = sayac++;
        this.doktor = doktor;
        this.hasta = hasta;
        this.tarih = tarih;
    }

    // Getter metodları
    public int getId() {
        return id;
    }

    public Doktor getDoktor() {
        return doktor;
    }

    public Hasta getHasta() {
        return hasta;
    }

    public String getTarih() {
        return tarih;
    }

    @Override
    public String toString() {
        return "Randevu #" + id + " | Tarih: " + tarih +
                "\nDoktor: " + doktor +
                "\nHasta: " + hasta;
    }
}