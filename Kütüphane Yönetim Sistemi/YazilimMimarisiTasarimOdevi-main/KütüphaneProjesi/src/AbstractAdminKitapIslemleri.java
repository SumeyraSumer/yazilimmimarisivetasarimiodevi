/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EXCALIBUR
 */
public abstract class AbstractAdminKitapIslemleri {
    
    public abstract void kitapSil(int id);
   
    public abstract void kitapEkle(String kitap_ad, String kitap_yazar, String kitap_konu, String tarih);

    public abstract void kitapGuncelle(int id, String yeniAd, String yeniYazar, String yeniKonu, String yeniTarih);
    
    
}
