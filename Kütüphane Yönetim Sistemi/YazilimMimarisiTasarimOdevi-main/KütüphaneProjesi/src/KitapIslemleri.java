
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author EXCALIBUR
 */
public class KitapIslemleri extends AbstractAdminKitapIslemleri{

    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    @Override
    
    public void kitapSil(int id) {
        String sorgu = "Delete from kitaplar where id = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override

    public void kitapGuncelle(int id, String yeniAd, String yeniYazar, String yeniKonu, String yeniTarih) {

        String sorgu = "Update kitaplar set kitap_adi= ? , yazar= ? , kitap_konu= ? , tarih= ? where id= ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, yeniAd);
            preparedStatement.setString(2, yeniYazar);

            preparedStatement.setString(3, yeniKonu);

            preparedStatement.setString(4, yeniTarih);

            preparedStatement.setInt(5, id);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    // KİTAP ÖDÜNÇ AL
    public void kitapOduncAl(int id){
    Connection conn = null;
    PreparedStatement pstKitapSil = null;
    PreparedStatement pstOduncEkle = null;
    ResultSet rs = null;

    try {
        conn = this.con; // Varsayılan bağlantınızı kullanın

        // Önce kitabın bilgilerini al
        String sqlKitapBilgi = "SELECT * FROM kitaplar WHERE id = ?";
        pstKitapSil = conn.prepareStatement(sqlKitapBilgi);
        pstKitapSil.setInt(1, id);
        rs = pstKitapSil.executeQuery();

        if (rs.next()) {
            String kitapAdi = rs.getString("kitap_adi");
            String yazar = rs.getString("yazar");
            String kitap_konu = rs.getString("kitap_konu");
            String tarih = rs.getString("tarih");
            // Diğer kitap bilgileri...

            // Kitabı kitaplar tablosundan sil
            String sqlKitapSil = "DELETE FROM kitaplar WHERE id = ?";
            pstKitapSil = conn.prepareStatement(sqlKitapSil);
            pstKitapSil.setInt(1, id);
            pstKitapSil.executeUpdate();
            // Kitabın durumunu 'ÖDÜNÇ ALINDI' olarak güncelle
            kitapDurumuGuncelle(id, "ÖDÜNÇ ALINDI");

            // Kitabı odunc_tablosu'na ekle
            String sqlOduncEkle = "INSERT INTO odunc_tablosu (odunc_kitap_adi, odunc_yazar,odunc_kitap_konu,odunc_tarih) VALUES (?, ?, ?,?)";
            pstOduncEkle = conn.prepareStatement(sqlOduncEkle);
            pstOduncEkle.setString(1, kitapAdi);
            pstOduncEkle.setString(2, yazar);
            pstOduncEkle.setString(3, kitap_konu);
            pstOduncEkle.setString(4, tarih);
            
            // Diğer kitap bilgileri için pstOduncEkle.setString(...) kullanılabilir
            pstOduncEkle.executeUpdate();
        }
    } catch (SQLException ex) {
        Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        // Kaynakları serbest bırak
        try {
            if (rs != null) rs.close();
            if (pstKitapSil != null) pstKitapSil.close();
            if (pstOduncEkle != null) pstOduncEkle.close();
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
   // KİTAP İADE ET
    public void kitapIadeEt(int id){
    Connection conn = null;
    PreparedStatement pstOduncSil = null;
    PreparedStatement pstKitapEkle = null;
    ResultSet rs = null;

    try {
        conn = this.con; // Varsayılan bağlantınızı kullanın

        // Önce ödünç alınan kitabın bilgilerini al
        String sqlOduncBilgi = "SELECT * FROM odunc_tablosu WHERE odunc_id = ?";
        pstOduncSil = conn.prepareStatement(sqlOduncBilgi);
        pstOduncSil.setInt(1, id);
        rs = pstOduncSil.executeQuery();

        if (rs.next()) {
            String kitapAdi = rs.getString("odunc_kitap_adi");
            String yazar = rs.getString("odunc_yazar");
            String kitap_konu = rs.getString("odunc_kitap_konu");
            String tarih = rs.getString("odunc_tarih");
            // Diğer kitap bilgileri...

            // Kitabı odunc_tablosu'ndan sil
            String sqlOduncSil = "DELETE FROM odunc_tablosu WHERE odunc_id = ?";
            pstOduncSil = conn.prepareStatement(sqlOduncSil);
            pstOduncSil.setInt(1, id);
            pstOduncSil.executeUpdate();
            // Kitabın durumunu 'RAFTA' olarak güncelle
            kitapDurumuGuncelle(id, "RAFTA");

            // Kitabı kitaplar tablosuna ekle
            String sqlKitapEkle = "INSERT INTO kitaplar (kitap_adi, yazar, kitap_konu, tarih) VALUES (?, ?, ?, ?)";
            pstKitapEkle = conn.prepareStatement(sqlKitapEkle);
            pstKitapEkle.setString(1, kitapAdi);
            pstKitapEkle.setString(2, yazar);
            pstKitapEkle.setString(3, kitap_konu);
            pstKitapEkle.setString(4, tarih);
            
            // Diğer kitap bilgileri için pstKitapEkle.setString(...) kullanılabilir
            pstKitapEkle.executeUpdate();
        }
    } catch (SQLException ex) {
        Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        // Kaynakları serbest bırak
        try {
            if (rs != null) rs.close();
            if (pstOduncSil != null) pstOduncSil.close();
            if (pstKitapEkle != null) pstKitapEkle.close();
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    
    private void kitapDurumuGuncelle(int kitapId, String durum) {
        Connection conn = null;
        PreparedStatement pstKitapDurumuGuncelle = null;

        try {
            conn = this.con; // Varsayılan bağlantınızı kullanın

            String sqlKitapDurumuGuncelle = "UPDATE kitaplar SET durum = ? WHERE id = ?";
            pstKitapDurumuGuncelle = conn.prepareStatement(sqlKitapDurumuGuncelle);
            pstKitapDurumuGuncelle.setString(1, durum);
            pstKitapDurumuGuncelle.setInt(2, kitapId);
            pstKitapDurumuGuncelle.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // Kaynakları serbest bırak
            try {
                if (pstKitapDurumuGuncelle != null) pstKitapDurumuGuncelle.close();
            } catch (SQLException ex) {
                Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    
    public void kitapEkle(String kitap_ad, String kitap_yazar, String kitap_konu, String tarih) {

        String sorgu = "Insert Into kitaplar (kitap_adi,yazar,kitap_konu,tarih) VALUES (?,?,?,?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, kitap_ad);

            preparedStatement.setString(2, kitap_yazar);

            preparedStatement.setString(3, kitap_konu);

            preparedStatement.setString(4, tarih);
            
       

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    // KİTAPLARI LİSTELE
    public ArrayList<Kitap> kitaplariGetir() {
        ArrayList<Kitap> cikti = new ArrayList<Kitap>();

        try {
            statement = con.createStatement();
            String sorgu = "Select * From kitaplar";

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int id = rs.getInt("id");
                String kitap_adi = rs.getString("kitap_adi");
                String yazar = rs.getString("yazar");
                String kitap_konu = rs.getString("kitap_konu");
                String tarih = rs.getString("tarih");

                cikti.add(new Kitap(id, kitap_adi, yazar, kitap_konu, tarih));

            }

            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    // ÖDÜNÇ ALINAN KİTAPLARI LİSTELE
     public ArrayList<OduncAlinanKitap> oduncAlinanKitaplariGetir() {
        ArrayList<OduncAlinanKitap> cikti = new ArrayList<OduncAlinanKitap>();

        try {
            statement = con.createStatement();
            String sorgu = "SELECT * FROM odunc_tablosu";


            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int id = rs.getInt("odunc_id");
                String kitap_adi = rs.getString("odunc_kitap_adi");
                String yazar = rs.getString("odunc_yazar");
                String kitap_konu = rs.getString("odunc_kitap_konu");
                String tarih = rs.getString("odunc_tarih");
                OduncAlinanKitap oduncAlinanKitap = OduncAlinanKitapFactory.createOduncAlinanKitap(id, kitap_adi, yazar, kitap_konu, tarih);

                cikti.add(oduncAlinanKitap);

            }

            return cikti;
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    
    
    

    

    public KitapIslemleri(Connection con) {
        /*
        String url = "jdbc:mysql://" + DataBase.host + ":" + DataBase.port + "/" + DataBase.db_ismi;
          
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı.");
        }


        try {
            con = DriverManager.getConnection(url, DataBase.kullanici_adi, DataBase.parola);
            System.out.println("Baglanti Basarili");
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız");
        }
        */
        /*
        con = DatabaseConnection.getInstance().getConnection();
*/      
        this.con = con;
        if (this.con == null) {
            System.out.println("Veritabanına baglanilamadi.");
            System.exit(1);
        }
        System.out.println("Veritabanına baglanti basarili.");
        
    }

    public static void main(String[] args) {
KitapIslemleri kitapIslemleri = KitapFactory.createKitapIslemleri();
    }

    

}
