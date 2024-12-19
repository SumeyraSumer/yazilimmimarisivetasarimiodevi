public class GirisObserverImpl implements GirisObserver {
    private final  Login loginFrame;

    public GirisObserverImpl(Login loginFrame) {
        this.loginFrame = loginFrame;
    }

    @Override
    public void kullaniciGirisiBasarili(String kullaniciTipi) {
        if ("admin".equals(kullaniciTipi)) {
            // Admin formunu aç
            KitapEkrani adminEkrani = new KitapEkrani(loginFrame, true);
            loginFrame.setVisible(false);
            adminEkrani.setVisible(true);
            System.exit(0);
        } else if ("kullanici".equals(kullaniciTipi)) {
            // Kullanıcı formunu aç
            KullanicilarEkrani kullaniciEkrani = new KullanicilarEkrani(loginFrame, true);
            loginFrame.setVisible(false);
            kullaniciEkrani.setVisible(true);
            System.exit(0);
        }
    }

    @Override
    public void girisBasarisiz() {
        loginFrame.getMesajYazisi().setText("Giriş Başarısız. Lütfen tekrar deneyin.");
    }
}
