/**
 * Created by gokhanyavas on 22.03.2017.
 */
public class App {
    public static void main(String[] args) {

        // ex 1
        try {
            Thread.sleep(111);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // ex 2 ; Aritmetik exception by zero

        int value = 7;

        value = value/0;

        // ex 3; nullpointerexception

        String text = null;

        System.out.println(text.length());

        // ex 4; index out of bound exception 3

        String [] texts = {"one","two","three"};

        System.out.println(texts[3]);

        // ex 4 version 2

        String [] texts1 = {"one","two","three"};

        try {
            System.out.println(texts1[3]);
        }
        catch (Exception e){
            System.out.println(e.getMessage());//Ekrana hataya sebep olani yazar.
            //e.toString(); detayli sekilde yazar.
        }


    }
}
