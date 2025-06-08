import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReceteYonetimi {
    private List<Recete> receteler;
    private List<Doktor> doktorlar;
    private List<Hasta> hastalar;
    private Scanner scanner;

    public ReceteYonetimi(List<Doktor> doktorlar, List<Hasta> hastalar) {
        this.receteler = new ArrayList<>();
        this.doktorlar = doktorlar;
        this.hastalar = hastalar;
        this.scanner = new Scanner(System.in);
    }

    public void receteOlustur() {
        System.out.println("\n--- Yeni Reçete Oluştur ---");

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
        System.out.print("Reçete tarihi (GG/AA/YYYY): ");
        String tarih = scanner.nextLine();

        // Reçete oluştur
        Recete yeniRecete = new Recete(doktorlar.get(doktorSecim), hastalar.get(hastaSecim), tarih);

        // İlaç ekleme
        System.out.println("\nİlaç ekleyin (Çıkmak için 'q' girin):");
        while (true) {
            System.out.print("İlaç adı: ");
            String ilac = scanner.nextLine();
            if (ilac.equalsIgnoreCase("q")) {
                break;
            }
            yeniRecete.ilacEkle(ilac);
        }

        receteler.add(yeniRecete);
        System.out.println("\nReçete başarıyla oluşturuldu:");
        System.out.println(yeniRecete);
    }

    public void receteleriListele() {
        System.out.println("\n--- Tüm Reçeteler ---");
        if (receteler.isEmpty()) {
            System.out.println("Henüz reçete bulunmamaktadır.");
        } else {
            for (Recete recete : receteler) {
                System.out.println(recete);
                System.out.println("------------------------");
            }
        }
    }

    public List<Recete> getReceteler() {
        return receteler;
    }
}