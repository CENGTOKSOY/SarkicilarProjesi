import java.util.Scanner; // Kullanıcı girdisi almak için Scanner sınıfını içe aktarıyoruz.

public class Test {
    // Sarkicilar sınıfından bir nesne oluşturuyoruz. Bu nesne, şarkıcı listesini yönetecek.
    private static Sarkicilar sarkicilar = new Sarkicilar();
    // Kullanıcıdan girdi almak için Scanner nesnesi oluşturuyoruz.
    private static Scanner scanner = new Scanner(System.in);

    // Kullanıcıya sunulan işlemleri ekrana yazdıran metod.
    public static void islemleri_bastir() {
        System.out.println("\t 0-İşlemleri Görüntüle");
        System.out.println("\t 1-Şarkıcıları Görüntüle");
        System.out.println("\t 2-Şarkıcı Ekle");
        System.out.println("\t 3-Şarkıcı Güncelle");
        System.out.println("\t 4-Şarkıcı Sil");
        System.out.println("\t 5-Şarkıcı Ara");
        System.out.println("\t 6-Uygulamadan Çık");
    }

    // Şarkıcı listesini görüntüleyen metod.
    public static void sarkici_goruntule() {
        sarkicilar.sarkicilari_bastir();
    }

    // Yeni bir şarkıcı eklemek için kullanıcıdan isim alıp listeye ekleyen metod.
    public static void sarkici_ekle(){
        System.out.println("Eklemek istediğiniz şarkıcının ismi:");
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ekle(isim);
    }

    // Mevcut bir şarkıcıyı güncellemek için pozisyon ve yeni isim alıp listeyi güncelleyen metod.
    public static void sarkici_guncelle() {
        System.out.println("Güncellemek istediğiniz pozisyon(1,2,3...)");
        int pozisyon = scanner.nextInt();
        scanner.nextLine(); // İnteger girdiden sonra gelen newline'ı tüketmek için.
        String yeni_isim = scanner.nextLine();
        sarkicilar.sarkici_guncelle(yeni_isim, pozisyon - 1);
    }

    // Listeden bir şarkıcıyı silmek için pozisyon alıp şarkıcıyı silen metod.
    public static void sil() {
        System.out.println("Silmek istediğiniz pozisyon (1,2,3....)");
        int pozisyon = scanner.nextInt();
        sarkicilar.sarkici_sil(pozisyon-1);
    }

    // Listede bir şarkıcı aramak için isim alıp arama yapan metod.
    public static void ara() {
        System.out.println("Aramak istediğiniz şarkıcı:");
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ara(isim);
    }

    // Uygulamanın ana metodunu içerir. Kullanıcıya hoşgeldiniz mesajı gösterir ve işlemleri sunar.
    public static void main(String[] args) {
        System.out.println("\t Şarkıcı Uygulamasına Hoşgeldiniz...");
        islemleri_bastir();
        boolean cikis = false;
        int islem;
        // Kullanıcı çıkış yapana kadar işlemleri alıp ilgili metodu çağıran döngü.
        while(!cikis) {
            System.out.println("Bir işlem seçiniz:");
            islem = scanner.nextInt();
            scanner.nextLine(); // İnteger girdiden sonra gelen newline'ı tüketmek için.
            switch(islem) {
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    sarkici_goruntule();
                    break;
                case 2:
                    sarkici_ekle();
                    break;
                case 3:
                    sarkici_guncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis = true;
                    System.out.println("Uygulamadan çıkılıyor...");
                    break;
            }
        }
    }
}
