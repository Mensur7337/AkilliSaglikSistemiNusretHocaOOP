import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RandevuYonetimi {
    private List<Randevu> randevular;
    private List<Doktor> doktorlar;
    private List<Hasta> hastalar;
    private Scanner scanner;

    public RandevuYonetimi(List<Doktor> doktorlar, List<Hasta> hastalar) {
        this.randevular = new ArrayList<>();
        this.doktorlar = doktorlar;
        this.hastalar = hastalar;
        this.scanner = new Scanner(System.in);
    }

    public void randevuOlustur() {
        System.out.println("\n--- Yeni Randevu Oluştur ---");

        // Doktor seçimi
        System.out.println("\nDoktor Listesi:");
        for (int i = 0; i < doktorlar.size(); i++) {
            System.out.println((i + 1) + ". " + doktorlar.get(i));
        }
        System.out.print("Doktor seçiniz (1-" + doktorlar.size() + "): ");
        int doktorSecim = scanner.nextInt() - 1;
        scanner.nextLine(); // dummy read

        // Hasta seçimi
        System.out.println("\nHasta Listesi:");
        for (int i = 0; i < hastalar.size(); i++) {
            System.out.println((i + 1) + ". " + hastalar.get(i));
        }
        System.out.print("Hasta seçiniz (1-" + hastalar.size() + "): ");
        int hastaSecim = scanner.nextInt() - 1;
        scanner.nextLine(); // dummy read

        // Tarih bilgisi
        System.out.print("Randevu tarihi (GG/AA/YYYY SS:DD): ");
        String tarih = scanner.nextLine();

        // Randevu oluştur
        Randevu yeniRandevu = new Randevu(doktorlar.get(doktorSecim), hastalar.get(hastaSecim), tarih);
        randevular.add(yeniRandevu);

        System.out.println("\nRandevu başarıyla oluşturuldu:");
        System.out.println(yeniRandevu);
    }

    public void randevulariListele() {
        System.out.println("\n--- Tüm Randevular ---");
        if (randevular.isEmpty()) {
            System.out.println("Henüz randevu bulunmamaktadır.");
        } else {
            for (Randevu randevu : randevular) {
                System.out.println(randevu);
                System.out.println("------------------------");
            }
        }
    }

    public List<Randevu> getRandevular() {
        return randevular;
    }
}