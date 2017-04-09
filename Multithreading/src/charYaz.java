/**
 * Created by gokhanyavas on 8.04.2017.
 */

// Karakter yazdiran runable sinifini uygulayan bir sinif ornegi
public class charYaz implements Runnable{

        private char karakter;
        private  int yazimSayisi;
        private int i;

        // Sinifa ait parametresiz yapilandirici
            public charYaz() {
        }

        // Sinifa ait parametre alan yapilandirici
            public charYaz(char karakter, int yazimSayisi) {
            this.karakter = karakter;
            this.yazimSayisi = yazimSayisi;
        }

        // Runable arabiriminin run metodu override edildi.

        @Override
        public void run() {
            // for dongusu icinde karakterler ekrana yazdirilir.
            for (i = 0; i< yazimSayisi; i++){
                System.out.println(karakter);
            }
        }
}
