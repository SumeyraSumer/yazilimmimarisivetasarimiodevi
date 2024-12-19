
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EXCALIBUR
 */
public class KullaniciIslemleri extends  AbstractKullaniciYonetimIslemleri{
    
    
     private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    
    /*
    public boolean girisYap(String kullanici_adi, String parola) {
        String sorgu = "Select * From adminler where username = ? and password = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, kullanici_adi);
            preparedStatement.setString(2, parola);

            ResultSet rs = preparedStatement.executeQuery();

            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    */
  
    /*
    public String girisYap(String kullanici_adi, String parola) {
    String sorgu = "SELECT * FROM adminler WHERE username = ? AND password = ?";
    try {
        preparedStatement = con.prepareStatement(sorgu);
        preparedStatement.setString(1, kullanici_adi);
        preparedStatement.setString(2, parola);

        ResultSet rs = preparedStatement.executeQuery();

        if (rs.next()) {
            return "admin";
        }

    } catch (SQLException ex) {
        Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
    }

    // Admin tablosunda giriş yapılmadıysa, kullanıcılar tablosuna bak
    sorgu = "SELECT * FROM kullanicilar WHERE username = ? AND password = ?";
    try {
        preparedStatement = con.prepareStatement(sorgu);
        preparedStatement.setString(1, kullanici_adi);
        preparedStatement.setString(2, parola);

        ResultSet rs = preparedStatement.executeQuery();

        if (rs.next()) {
            return "kullanici";
        }

    } catch (SQLException ex) {
        Logger.getLogger(KitapIslemleri.class.getName()).log(Level.SEVERE, null, ex);
    }

    // Herhangi bir tabloya giriş yapılamadıysa
    return null;
}

 */
    @Override
    public String girisYap(String kullanici_adi, String parola) {
    String adminSorgu = "SELECT * FROM adminler WHERE username = ? AND password = ?";
    String kullaniciSorgu = "SELECT * FROM kullanicilar WHERE username = ? AND password = ?";

    try {
        // Adminler tablosunda giriş kontrolü
        preparedStatement = con.prepareStatement(adminSorgu);
        preparedStatement.setString(1, kullanici_adi);
        preparedStatement.setString(2, parola);
        ResultSet adminResultSet = preparedStatement.executeQuery();

        if (adminResultSet.next()) {
            return "admin";
        }

        // Kullanıcılar tablosunda giriş kontrolü
        preparedStatement = con.prepareStatement(kullaniciSorgu);
        preparedStatement.setString(1, kullanici_adi);
        preparedStatement.setString(2, parola);
        ResultSet kullaniciResultSet = preparedStatement.executeQuery();

        if (kullaniciResultSet.next()) {
            return "kullanici";
        }

    } catch (SQLException ex) {
        Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        // Her durumda kaynakları kapat
        try {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Herhangi bir tabloya giriş yapılamadıysa
    return null;
}

    
    @Override
    public void kullaniciEkle(String adSoyad, String userName, String password) {

        String sorgu = "Insert Into kullanicilar (ad_soyad,username,password) VALUES (?,?,?)";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, adSoyad);

            preparedStatement.setString(2, userName);

            preparedStatement.setString(3, password);

            
            
          
            
            preparedStatement.executeUpdate();
            
            
           

        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public KullaniciIslemleri(Connection con) {
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
        this.con = con;
        if (this.con == null) {
            System.out.println("Veritabanına bağlanılamadı.");
            System.exit(1);
        }
        System.out.println("Veritabanına bağlantı başarılı.");

    }
    
     
    
}
