/**
 * Created by gokhanyavas on 16.03.2017.
 
 Bir önceki konuda olduğu gibi aynı işlemler burası içinde geçelidir. 
 Tek farklı int değilde String ifadeler kullanılmıştır. 
 
 */
public class ArraysofStrings {
    public static void main(String[] args) {

        String[] words = new String[3];

        words[0] = "Hello";
        words[1] = "to";
        words[2] = "you";

        System.out.println(words[2]);

        String[] fruits = {"apple","banana","pear","kiwi"};

        for (String fruit: fruits){
            System.out.println(fruit);
        }

        int value = 0;

        String text = null;
        System.out.println(text);

        String[] texts = new String[2];
        System.out.println(texts[0]);
        texts[0] = "one";
    }
}
