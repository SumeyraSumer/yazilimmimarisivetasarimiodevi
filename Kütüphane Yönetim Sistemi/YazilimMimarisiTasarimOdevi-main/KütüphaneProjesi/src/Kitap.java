    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EXCALIBUR
 */
public class Kitap {
    private int id;
    private String kitap_adi;
    private String yazar;
    private String kitap_konu;
    private String tarih;
    private String durum;

    public Kitap(int id, String kitap_adi, String yazar, String kitap_konu, String tarih) {
        this.id = id;
        this.kitap_adi = kitap_adi;
        this.yazar = yazar;
        this.kitap_konu = kitap_konu;
        this.tarih = tarih;
        this.durum = "RAFTA";
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the kitap_adi
     */
    public String getKitap_adi() {
        return kitap_adi;
    }

    /**
     * @param kitap_adi the kitap_adi to set
     */
    public void setKitap_adi(String kitap_adi) {
        this.kitap_adi = kitap_adi;
    }

    /**
     * @return the yazar
     */
    public String getYazar() {
        return yazar;
    }

    /**
     * @param yazar the yazar to set
     */
    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    /**
     * @return the kitap_konu
     */
    public String getKitap_konu() {
        return kitap_konu;
    }

    /**
     * @param kitap_konu the kitap_konu to set
     */
    public void setKitap_konu(String kitap_konu) {
        this.kitap_konu = kitap_konu;
    }

    /**
     * @return the tarih
     */
    public String getTarih() {
        return tarih;
    }

    /**
     * @param tarih the tarih to set
     */
    public void setTarih(String tarih) {
        this.tarih = tarih;
    }
        
    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }
    

   
    
    
}
