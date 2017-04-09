/**
 * Created by gokhanyavas on 16.03.2017.
 
 Diziler: 
 
 Diziler aynı tipte birden çok değişkeni tutabilen veri yapılarıdır. Nesne gibi düşündükleri için
 referans tipleri olarak değer görürler. 
 
 */
public class Arrays {
    public static void main(String[] args) {

        int value = 7;

		//Dizi oluşturulur. Dizimizin boyutu 3 yani 3 değişken tutabilen bir yapı tanımlamış olduk.
        int[] values;
        values = new int[3];

        System.out.println(values[0]);

		// Dizi elemanlarına değer atama yapılır.
        values[0] = 10;
        values[1] = 20;
        values[2] = 30;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);

		// Döngü yardımıyla diziye ait tüm değerler ekrana yazdırılır.
        for (int i=0; i<values.length; i++){
            System.out.println(values[i]);
        }

        int[] numbers = {5,6,7};
        for (int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }


    }
}
