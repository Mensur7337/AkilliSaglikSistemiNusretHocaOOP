import java.util.ArrayList;
import java.util.List;

public class Poliklinik {
    private String ad;
    private int kat;
    private String sorumluDoktor;
    private List<Doktor> doktorlar;
    private List<Hemsire> hemsireler;

    public Poliklinik(String ad, int kat, String sorumluDoktor) {
        this.ad = ad;
        this.kat = kat;
        this.sorumluDoktor = sorumluDoktor;
        this.doktorlar = new ArrayList<>();
        this.hemsireler = new ArrayList<>();
    }

    public void doktorEkle(Doktor doktor) {
        doktorlar.add(doktor);
        System.out.println(doktor + " polikliniğe eklendi.");
    }

    public void hemsireEkle(Hemsire hemsire) {
        hemsireler.add(hemsire);
        System.out.println(hemsire + " polikliniğe eklendi.");
    }

    public void poliklinikBilgileriGoster() {
        System.out.println("\nPoliklinik: " + ad);
        System.out.println("Kat: " + kat);
        System.out.println("Sorumlu Doktor: " + sorumluDoktor);

        System.out.println("\nDoktorlar:");
        for (Doktor doktor : doktorlar) {
            System.out.println("- " + doktor);
        }

        System.out.println("\nHemşireler:");
        for (Hemsire hemsire : hemsireler) {
            System.out.println("- " + hemsire);
        }
    }
}