/**
 * Created by gokhanyavas on 26.03.2017.
 */
public class App {

    public static void main(String[] args) {

        UrlLibrary urlLibrary = new UrlLibrary();

        for (String html: urlLibrary){
            System.out.println(html.length());
            System.out.println(html);
        }

    }
}
