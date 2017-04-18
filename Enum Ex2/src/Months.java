/**
 * Created by gokhanyavas on 18.04.2017.
 */
public enum Months {
    Ocak(1),
    Subat(2),
    Mart(3),
    Nisan(4),
    Mayis(5),
    Haziran(6),
    Temmuz(7),
    Agustos(8),
    Eylul(9),
    Ekim(10),
    Kasim(11),
    Aralik(12);

    private int month;

    Months(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }
}
