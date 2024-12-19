-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 03 Oca 2024, 12:22:47
-- Sunucu sürümü: 10.4.32-MariaDB
-- PHP Sürümü: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: demo
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı adminler
--

CREATE TABLE adminler (
  username text NOT NULL,
  password text NOT NULL,
  tip varchar(10) NOT NULL DEFAULT 'admin'
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci;

--
-- Tablo döküm verisi adminler
--

INSERT INTO adminler (username, password, tip) VALUES
('sumeyrasümer', 'smyrsmr', 'admin'),
('ümmügülsümyücel', 'ummu123', 'admin'),


-- --------------------------------------------------------

--
-- Tablo için tablo yapısı kitaplar
--

CREATE TABLE kitaplar (
  id int(11) NOT NULL,
  kitap_adi text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  yazar text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  kitap_konu text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  tarih text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  durum varchar(255) DEFAULT 'RAFTA'
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci;

--
-- Tablo döküm verisi kitaplar
--

INSERT INTO kitaplar (id, kitap_adi, yazar, kitap_konu, tarih, durum) VALUES
(1, 'Bülbülü Öldürmek', 'Harper Lee', 'Drama', '1960', 'RAFTA'),
(2, 'Hayvan Çiftliği', 'George Orwell', 'Distopya', '1945', 'RAFTA'),
(3, 'Frankenstein', 'Mary Shelley', 'Gotik', '1818', 'RAFTA'),
(4, 'Drakula', 'Bram Stoker', 'Gotik', '1897', 'RAFTA'),
(5, 'Sonsuzluğun Sonu', 'Isaac Asimov', 'Bilim Kurgu', '1955', 'RAFTA'),
(6, 'Dune', 'Frank Herbert', 'Bilim Kurgu', '1965', 'RAFTA'),
(7, 'Otostopçunun Galaksi Rehberi', 'Douglas Adams', 'Bilim Kurgu', '1979', 'RAFTA'),
(8, 'Mülksüzler', 'Ursula K. Le Guin', 'Bilim Kurgu', '1974', 'RAFTA'),
(9, 'Sineklerin Tanrısı', 'William Golding', 'Roman', '1954', 'RAFTA'),
(10, 'Küçük Prens', 'Antoine de Saint-Exupéry', 'Çocuk', '1943', 'RAFTA'),
(11, 'Denizler Altında Yirmi Bin Fersah', 'Jules Verne', 'Macera', '1870', 'RAFTA'),
(12, 'Seksen Günde Devri Alem', 'Jules Verne', 'Macera', '1873', 'RAFTA'),
(13, 'Vadideki Zambak', 'Honoré de Balzac', 'Klasik', '1836', 'RAFTA'),
(14, 'Monte Cristo Kontu', 'Alexandre Dumas', 'Klasik', '1844', 'RAFTA'),
(15, 'Üç Silahşörler', 'Alexandre Dumas', 'Macera', '1844', 'RAFTA'),
(16, 'Yüzüklerin Efendisi: Güç Yüzüklerinin Tarihi', 'J.R.R. Tolkien', 'Fantastik', '1981', 'RAFTA'),
(17, 'Göz', 'Stephen King', 'Korku', '1977', 'RAFTA'),
(18, 'Carrie', 'Stephen King', 'Korku', '1974', 'RAFTA'),
(19, 'O', 'Stephen King', 'Korku', '1986', 'RAFTA'),
(20, 'Gizli Bahçe', 'Frances Hodgson Burnett', 'Çocuk', '1911', 'RAFTA'),
(21, 'Robinson Crusoe', 'Daniel Defoe', 'Macera', '1719', 'RAFTA');


-- --------------------------------------------------------

--
-- Tablo için tablo yapısı kullanicilar
--

CREATE TABLE kullanicilar (
  id int(11) NOT NULL,
  ad_soyad varchar(255) NOT NULL,
  username varchar(50) NOT NULL,
  password varchar(255) NOT NULL,
  tip varchar(10) NOT NULL DEFAULT 'kullanici'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi kullanicilar
--

INSERT INTO kullanicilar (id, ad_soyad, username, password, tip) VALUES
(1, 'Sümeyra Sümer', 'süm', 'süm12345', 'kullanici'),
(2, 'Ümmügülsüm Yücel', 'gulsumycl', '1234gulsum', 'kullanici'),
(3, 'Zeki Kayık', 'zekikyk', 'zeki123', 'kullanici'),
(4, 'Merve Balat', 'mrvblt', '12345', 'kullanici');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı odunc_tablosu
--

CREATE TABLE odunc_tablosu (
  odunc_id int(11) NOT NULL,
  odunc_kitap_adi varchar(255) NOT NULL,
  odunc_yazar varchar(100) DEFAULT NULL,
  odunc_kitap_konu varchar(255) DEFAULT NULL,
  odunc_tarih varchar(55) DEFAULT NULL,
  durum varchar(255) DEFAULT 'ÖDÜNÇ ALINDI'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler kitaplar
--
ALTER TABLE kitaplar
  ADD PRIMARY KEY (id);

--
-- Tablo için indeksler kullanicilar
--
ALTER TABLE kullanicilar
  ADD PRIMARY KEY (id),
  ADD UNIQUE KEY username (username);

--
-- Tablo için indeksler odunc_tablosu
--
ALTER TABLE odunc_tablosu
  ADD PRIMARY KEY (odunc_id);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri kitaplar
--
ALTER TABLE kitaplar
  MODIFY id int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- Tablo için AUTO_INCREMENT değeri kullanicilar
--
ALTER TABLE kullanicilar
  MODIFY id int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Tablo için AUTO_INCREMENT değeri odunc_tablosu
--
ALTER TABLE odunc_tablosu
  MODIFY odunc_id int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;