/**
 * Created by gokhanyavas on 8.04.2017.
 */
public class RakamYaz implements Runnable{
    private int rakamlar;
    private int yazimSayisi;
    private int i;

    public RakamYaz() {
    }

    public RakamYaz(int rakamlar, int yazimSayisi) {
        this.rakamlar = rakamlar;
        this.yazimSayisi = yazimSayisi;
    }

    @Override
    public void run() {
        // for dongusu icinde rakamalar ekrana yazdirilir.
        for (i = 0; i< yazimSayisi; i++){
            System.out.println(rakamlar);
        }
    }
}
