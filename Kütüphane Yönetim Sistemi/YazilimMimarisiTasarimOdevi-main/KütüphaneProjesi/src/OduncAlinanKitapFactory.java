public class OduncAlinanKitapFactory {
    public static OduncAlinanKitap createOduncAlinanKitap(int id, String kitap_adi, String yazar, String kitap_konu, String tarih) {
        return new OduncAlinanKitap(id, kitap_adi, yazar, kitap_konu, tarih);
    }
}