import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by gokhanyavas on 21.03.2017.
 
 Scanner ile Dosya Okuma:
 
 Java'daki Dosya İşlemleri Sınıflar:
 
 1- InputStream: Byte tabanlıdır. Byte dizilerin ya da byte'ların tek tek okunmasını sağlar.
 				 Alt sınıfları:
 				 - FileInputStream
 				 - ByteArrayInputStream
 				 - FilterInputStream
 2- OutputStream: Byte tabanlıdır. Byte dizilerin ya da byte'ların tek tek yazılmasını sağlar.
 				  Altsınıflar:
 				  - FileOutputStream
 				  - ByteArrayOutputStream
 				  - FilterOutputStream
 3- Reader: Karakter tabanlı dosyalardaki karakterlerin okunmanı sağlar. 
 				Altsınıfları:
 				- BufferedReader
 				- InputStreamReader
 				- StringReader
 				
 4- Writer: Karakterlerin dosyalara yazılmasını sağlar. 
 			Altsınıfları:
 			- BufferedWriter
 			- OutputStreamWriter
 			- StringWriter
 			- PrintWriter
 			
 ---- File Sınıfı -------
 Dosya işlemlerinde bahsettiğimiz 4 sınıftan bağımsız olarak file sınıfı da kullanılmaktadır.
 Bu sınıf java'da bağımsız sınıflardan biridir.
 
 File, var olan dosyalar için bilgi almada kullanılır.
 
 File Sınıfı Yapılandırıcıları:
 
 public file(String isim): Parametre olarak verilen isim dosya - klasör ile file nesnesini eşleştirir.
 public file(String konum, String isim): parametrede verilen bilgileri eşleştirir.
 public file(File klasör, String isim):  parametrede verilen bilgileri eşleştirir.
 public file(URL uri) uri : uniform resource identifier bir standarttır. file:/ yazarak çağırılır.
 
 File Sınıfı Metotları
 
 boolean canRead(): Dosya uygulama tarafından okunabiliyorsa true döner.
 boolean canWrite(): Dosya uygulama tarafından yazılabiliyorsa true döner.
 boolean exists(): File nesnesi oluşturulurken yapılandırıcıda verilen isim, gösterilen konumdaki dosya-klasöre karşılık geliyorsa true döner.
 boolean isFile(): File nesnesi oluşturulurken yapılandırıcıda verilen isim, gösterilen konumdaki dosyaya karşılık geliyorsa true döner.
 boolean isDirectory(): File nesnesi oluşturulurken yapılandırıcıda verilen isim, gösterilen konumdaki klasöre karşılık geliyorsa true döner.
 boolean isAbsolute(): File nesnesi oluşturulurken yapılandırıcıda verilen isim, gösterilen konumdaki dosya-klasöre ait tam konumu veriyorsa true döner.
 String getAbsolute(): Dosya veya klasörün tam konumunu döner.
 String getPath(): Dosya veya klasörün ismini döner.
 String getParent(): Dosya veya klasörün içersinde bulunduğu bir üst klasörü döner.
 long length(): Dosya uzunluğu byte cinsinden döner. Şayet file nesnesi klasörü temsil ediyorsa 0 döner.
 long lastModified(): Dosya-klasörün son değiştirilme zamanını döner.
 String[] list(): Fıle nesnesinin temsil ettiği dosya-klasörün içindekileri string dizi olarak döner.
 
 
 
 */
public class App {
    public static void main(String[] args) throws FileNotFoundException {

        String filename = "example.txt";

        File textFile = new File(filename);

        Scanner in = new Scanner(textFile);

        int value = in.nextInt();
        System.out.println("Read value: " + value);

        in.nextLine();
        int count = 2;

        while (in.hasNextLine()){
            String line = in.nextLine();
            System.out.println(count + " " + line);
            count++;
        }

        in.close();

    }
}
