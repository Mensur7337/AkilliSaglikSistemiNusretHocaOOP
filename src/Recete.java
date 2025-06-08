import java.util.ArrayList;
import java.util.List;

public class Recete {
    private static int sayac = 1;
    private int id;
    private List<String> ilaclar;
    private Doktor doktor;
    private Hasta hasta;
    private String tarih;

    public Recete(Doktor doktor, Hasta hasta, String tarih) {
        this.id = sayac++;
        this.doktor = doktor;
        this.hasta = hasta;
        this.tarih = tarih;
        this.ilaclar = new ArrayList<>();
    }

    public void ilacEkle(String ilac) {
        ilaclar.add(ilac);
    }

    // Getter metodları
    public int getId() {
        return id;
    }

    public List<String> getIlaclar() {
        return ilaclar;
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
        StringBuilder sb = new StringBuilder();
        sb.append("Reçete #").append(id).append(" | Tarih: ").append(tarih)
                .append("\nDoktor: ").append(doktor)
                .append("\nHasta: ").append(hasta)
                .append("\nİlaçlar:\n");

        for (String ilac : ilaclar) {
            sb.append("- ").append(ilac).append("\n");
        }

        return sb.toString();
    }
}