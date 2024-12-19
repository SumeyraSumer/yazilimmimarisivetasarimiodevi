
public class OduncAlinanKitap {
    
    private int odunc_id;
    private String odunc_kitap;
    private String odunc_yazar;
    private String odunc_konu;
    private String odunc_tarih;
    private String durum;

    public OduncAlinanKitap(int id, String kitap_adi, String yazar, String kitap_konu, String tarih) {
        this.odunc_id = id;
        this.odunc_kitap = kitap_adi;
        this.odunc_yazar = yazar;
        this.odunc_konu = kitap_konu;
        this.odunc_tarih = tarih;
        this.durum = "ÖDÜNÇ ALINDI";
    }

    /**
     * @return the odunc_id
     */
    public int getOdunc_id() {
        return odunc_id;
    }

    /**
     * @param odunc_id the odunc_id to set
     */
    public void setOdunc_id(int odunc_id) {
        this.odunc_id = odunc_id;
    }

    /**
     * @return the odunc_kitap
     */
    public String getOdunc_kitap() {
        return odunc_kitap;
    }

    /**
     * @param odunc_kitap the odunc_kitap to set
     */
    public void setOdunc_kitap(String odunc_kitap) {
        this.odunc_kitap = odunc_kitap;
    }

    /**
     * @return the odunc_yazar
     */
    public String getOdunc_yazar() {
        return odunc_yazar;
    }

    /**
     * @param odunc_yazar the odunc_yazar to set
     */
    public void setOdunc_yazar(String odunc_yazar) {
        this.odunc_yazar = odunc_yazar;
    }

    /**
     * @return the odunc_konu
     */
    public String getOdunc_konu() {
        return odunc_konu;
    }

    /**
     * @param odunc_konu the odunc_konu to set
     */
    public void setOdunc_konu(String odunc_konu) {
        this.odunc_konu = odunc_konu;
    }

    /**
     * @return the odunc_tarih
     */
    public String getOdunc_tarih() {
        return odunc_tarih;
    }

    /**
     * @param odunc_tarih the odunc_tarih to set
     */
    public void setOdunc_tarih(String odunc_tarih) {
        this.odunc_tarih = odunc_tarih;
    }
    public String getDurum() {
        return durum;
    }

    /**
     * @param durum the durum to set
     */
    public void setDurum(String durum) {
        this.durum = durum;
    }
    
}
