
import javax.swing.JLabel;


public class Login extends javax.swing.JFrame {
    
   
  private KullaniciIslemleri islemler = KullaniciFactory.createKullaniciIslemleri();
    private GirisObserver observer = new GirisObserverImpl(this);
    
    public Login() {
        initComponents();
    }
    

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kullanici_adi_alani = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        parola_alani = new javax.swing.JPasswordField();
        giris_yap = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        kayit = new javax.swing.JButton();
        mesaj_yazisi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(200, 65, 83));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("S&G HARMONY");

        jLabel8.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("kütüphane sistemi");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel5))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addGap(8, 8, 8)))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel5)
                .addGap(71, 71, 71)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(225, Short.MAX_VALUE))
        );

        jPanel1.add(Right);
        Right.setBounds(0, 0, 400, 500);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(200, 65, 83));
        jLabel1.setText("GİRİŞ YAP");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Kullanıcı Adı");

        kullanici_adi_alani.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kullanici_adi_alani.setForeground(new java.awt.Color(102, 102, 102));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Şifre");

        giris_yap.setBackground(new java.awt.Color(200, 65, 83));
        giris_yap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        giris_yap.setForeground(new java.awt.Color(255, 255, 255));
        giris_yap.setText("Giriş Yap");
        giris_yap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giris_yapActionPerformed(evt);
            }
        });

        jLabel4.setText("Hesabın mı yok ?");

        kayit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kayit.setForeground(new java.awt.Color(255, 51, 51));
        kayit.setText("Kayıt Ol");
        kayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitActionPerformed(evt);
            }
        });

        mesaj_yazisi.setForeground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(kullanici_adi_alani)
                                .addComponent(jLabel3)
                                .addComponent(parola_alani, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                                .addGroup(LeftLayout.createSequentialGroup()
                                    .addComponent(giris_yap, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(mesaj_yazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(LeftLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kayit)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kullanici_adi_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(parola_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(giris_yap, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesaj_yazisi))
                .addGap(33, 33, 33)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(kayit))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jPanel1.add(Left);
        Left.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitActionPerformed
        
        SignUp SignUpFrame = new SignUp();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null); 
        this.dispose();
    }//GEN-LAST:event_kayitActionPerformed
/*
    private void giris_yapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giris_yapActionPerformed
       mesaj_yazisi.setText("");
        
        String kullanici_adi = kullanici_adi_alani.getText();  
        String parola = new String(parola_alani.getPassword());
        
        boolean girisBasarili = islemler.girisYap(kullanici_adi,parola);
        
        if(girisBasarili){
            KitapEkrani calisanEkrani = new KitapEkrani(this, true);
            setVisible(false);
            
            calisanEkrani.setVisible(true);
            System.exit(0);
        }
        else{
            mesaj_yazisi.setText("Giriş Başarısız Lütfen tekrar deneyin..");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_giris_yapActionPerformed
*/
    
    
    private void giris_yapActionPerformed(java.awt.event.ActionEvent evt) {                                          
        /*
        mesaj_yazisi.setText("");

        String kullanici_adi = kullanici_adi_alani.getText();  
        String parola = new String(parola_alani.getPassword());

        String kullaniciTipi = islemler.girisYap(kullanici_adi, parola);
        */
        // Artık observer ile durumu kontrol ediyoruz
        
        mesaj_yazisi.setText("");

    String kullanici_adi = kullanici_adi_alani.getText();  
    String parola = new String(parola_alani.getPassword());

    String kullaniciTipi = islemler.girisYap(kullanici_adi, parola);

    // Observer ile durumu kontrol et
    if (kullaniciTipi != null) {
        if ("admin".equals(kullaniciTipi)) {
            // Admin girişi başarılı
            observer.kullaniciGirisiBasarili("admin");
        } else if ("kullanici".equals(kullaniciTipi)) {
            // Kullanıcı girişi başarılı
            observer.kullaniciGirisiBasarili("kullanici");
        }
    } else {
        // Giriş başarısız
        observer.girisBasarisiz();
    }
    }
    
    
    
    /*
   
    private void giris_yapActionPerformed(java.awt.event.ActionEvent evt) {                                          
    mesaj_yazisi.setText("");

    String kullanici_adi = kullanici_adi_alani.getText();  
    String parola = new String(parola_alani.getPassword());
    
    String kullaniciTipi = islemler.girisYap(kullanici_adi, parola);
    
    if ("admin".equals(kullaniciTipi)) {
        // Admin formunu aç
        KitapEkrani adminEkrani = new KitapEkrani(this, true);
        setVisible(false);
        adminEkrani.setVisible(true);
        System.exit(0);
    } else if ("kullanici".equals(kullaniciTipi)) {
        // Kullanıcı formunu aç
        KullanicilarEkrani kullaniciEkrani = new KullanicilarEkrani(this, true);
        setVisible(false);
        kullaniciEkrani.setVisible(true);
        System.exit(0);
    } else {
        mesaj_yazisi.setText("Giriş Başarısız. Lütfen tekrar deneyin.");
    }
}
    /*
    
    
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JButton giris_yap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kayit;
    private javax.swing.JTextField kullanici_adi_alani;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JPasswordField parola_alani;
    // End of variables declaration//GEN-END:variables

    public JLabel getMesajYazisi() {
        return mesaj_yazisi;
    }
}
