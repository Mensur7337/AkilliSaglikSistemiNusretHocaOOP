public class Hemsire {
    private int id;
    private String ad;
    private String soyad;
    private String telefon;
    private String sertifikalar;
    private String calistigiPoliklinik;

    public Hemsire(int id, String ad, String soyad, String telefon,
                   String sertifikalar, String calistigiPoliklinik) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
        this.sertifikalar = sertifikalar;
        this.calistigiPoliklinik = calistigiPoliklinik;
    }

    public void hastaMuayeneHazirligi(Hasta hasta) {
        System.out.println("Hemşire " + ad + " " + soyad + ", " +
                hasta.getAd() + " için muayene hazırlığını yaptı.");
    }

    @Override
    public String toString() {
        return "Hemşire " + ad + " " + soyad + " (" + calistigiPoliklinik + ")";
    }
}