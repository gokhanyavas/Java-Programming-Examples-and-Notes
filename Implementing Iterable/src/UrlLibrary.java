import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by gokhanyavas on 26.03.2017.
 */
public class UrlLibrary implements Iterable<String> {

    private LinkedList<String> urls = new LinkedList<String>();

    private class  UrlIterator implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < urls.size();
        }

        @Override
        public String next() {

            StringBuilder sb = new StringBuilder();

            try {
                URL url = new URL(urls.get(index));

                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));


                String line = null;

                while ((line = br.readLine()) != null){
                    sb.append(line);
                    sb.append("\n");
                }

                br.close();
            }  catch (Exception e) {
                e.printStackTrace();
            }

            index++;

            return sb.toString();
        }

        @Override
        public void remove() {

            urls.remove(index);

        }
    }

    public UrlLibrary(){
        urls.add("http://gokhanyavas.com");
        urls.add("http://gokhanyavas.me");
        urls.add("http://gurkanyavas.com");


    }

    @Override
    public Iterator<String> iterator() {
        return new UrlIterator();
    }

    /*
    @Override
    public Iterator<String> iterator() {
        return urls.iterator();
    }
    */
}
