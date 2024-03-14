import java.util.ArrayList; // ArrayList sınıfını içe aktarıyoruz.

public class Sarkicilar {
    // Şarkıcı listesi için private bir ArrayList oluşturuyoruz.
    private ArrayList<String> sarkici_listesi = new ArrayList<String>();

    // Şarkıcı listesindeki tüm şarkıcıları ekrana yazdıran metod.
    public void sarkicilari_bastir() {
        System.out.println("Şarkıcı Listesinde " + sarkici_listesi.size() + " kadar şarkıcı var");
        for (int i = 0; i < sarkici_listesi.size(); i++) {
            System.out.println((i+1) + ".Şarkıcı :" + sarkici_listesi.get(i));
        }
    }

    // Yeni bir şarkıcı ekleyen metod.
    public void sarkici_ekle(String isim) {
        sarkici_listesi.add(isim); // Listeye şarkıcı ekliyoruz.
        System.out.println("Şarkıcı Listesi Güncellendi...");
    }

    // Belirli bir pozisyondaki şarkıcıyı güncelleyen metod.
    public void sarkici_guncelle(String yeni_isim, int pozisyon) {
        sarkici_listesi.set(pozisyon, yeni_isim); // Listede şarkıcıyı güncelliyoruz.
        System.out.println("Şarkıcı Listesi Güncellendi...");
    }

    // Belirli bir pozisyondaki şarkıcıyı silen metod.
    public void sarkici_sil(int pozisyon) {
        String isim = sarkici_listesi.get(pozisyon); // Silinecek şarkıcının ismini alıyoruz.
        sarkici_listesi.remove(pozisyon); // Şarkıcıyı listeden kaldırıyoruz.
        System.out.println(isim + " isimli şarkıcı listeden silindi...");
    }

    // Listede bir şarkıcı arayan metod.
    public void sarkici_ara(String sarkici_ismi) {
        int pozisyon = sarkici_listesi.indexOf(sarkici_ismi); // Şarkıcının pozisyonunu buluyoruz.
        if (pozisyon >= 0) {
            System.out.println("Şarkıcı Bulundu.");
            System.out.println(sarkici_ismi + " isimli şarkıcı " + (pozisyon+1) + ". pozisyonda");
        } else {
            System.out.println("Şarkıcı Bulunamadı...");
        }
    }
}
