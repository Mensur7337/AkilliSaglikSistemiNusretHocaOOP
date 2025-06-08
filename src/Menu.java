import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Doktor> doktorlar;
    private List<Hasta> hastalar;
    private RandevuYonetimi randevuYonetimi;
    private ReceteYonetimi receteYonetimi;
    private Scanner scanner;

    public Menu() {
        this.doktorlar = new ArrayList<>();
        this.hastalar = new ArrayList<>();
        this.scanner = new Scanner(System.in);

        // Örnek veriler ekleyelim
        doktorlar.add(new Doktor(1, "Ahmet Yılmaz", "Dahiliye"));
        doktorlar.add(new Doktor(2, "Ayşe Kaya", "Kardiyoloji"));
        doktorlar.add(new Doktor(3, "Mehmet Demir", "Ortopedi"));

        hastalar.add(new Hasta(1, "Zeynep Aksoy", "12345678901", 30));
        hastalar.add(new Hasta(2, "Ali Veli", "23456789012", 45));
        hastalar.add(new Hasta(3, "Fatma Kaplan", "34567890123", 28));

        this.randevuYonetimi = new RandevuYonetimi(doktorlar, hastalar);
        this.receteYonetimi = new ReceteYonetimi(doktorlar, hastalar);
    }

    public void anaMenu() {
        while (true) {
            System.out.println("\n=== AKILLI SAĞLIK SİSTEMİ ===");
            System.out.println("1. Randevu İşlemleri");
            System.out.println("2. Reçete İşlemleri");
            System.out.println("3. Doktor Listesi");
            System.out.println("4. Hasta Listesi");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminiz: ");

            int secim = scanner.nextInt();
            scanner.nextLine(); // dummy read

            switch (secim) {
                case 1:
                    randevuMenu();
                    break;
                case 2:
                    receteMenu();
                    break;
                case 3:
                    doktorlariListele();
                    break;
                case 4:
                    hastalariListele();
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
            }
        }
    }

    private void randevuMenu() {
        while (true) {
            System.out.println("\n=== RANDEVU İŞLEMLERİ ===");
            System.out.println("1. Yeni Randevu Oluştur");
            System.out.println("2. Randevuları Listele");
            System.out.println("0. Ana Menü");
            System.out.print("Seçiminiz: ");

            int secim = scanner.nextInt();
            scanner.nextLine(); // dummy read

            switch (secim) {
                case 1:
                    randevuYonetimi.randevuOlustur();
                    break;
                case 2:
                    randevuYonetimi.randevulariListele();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
            }
        }
    }

    private void receteMenu() {
        while (true) {
            System.out.println("\n=== REÇETE İŞLEMLERİ ===");
            System.out.println("1. Yeni Reçete Oluştur");
            System.out.println("2. Reçeteleri Listele");
            System.out.println("0. Ana Menü");
            System.out.print("Seçiminiz: ");

            int secim = scanner.nextInt();
            scanner.nextLine(); // dummy read

            switch (secim) {
                case 1:
                    receteYonetimi.receteOlustur();
                    break;
                case 2:
                    receteYonetimi.receteleriListele();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
            }
        }
    }

    private void doktorlariListele() {
        System.out.println("\n--- Doktor Listesi ---");
        for (Doktor doktor : doktorlar) {
            System.out.println(doktor);
        }
    }

    private void hastalariListele() {
        System.out.println("\n--- Hasta Listesi ---");
        for (Hasta hasta : hastalar) {
            System.out.println(hasta);
        }
    }
}