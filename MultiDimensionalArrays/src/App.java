/**
 * Created by gokhanyavas on 16.03.2017.
 
 Çok boyutlu diziler: 
 Satır ve sütünlardan oluşan ve bellekte art arda sıralanan yapılara çok boyutlu diziler denir. 
 
 
 */
public class App {
    public static void main(String[] args) {

        int[] values = {3,5,2343};
        System.out.println(values[2]);

        //multi arrays
        int [][] grid = {
                {0,1,2},
                {3,5,6},
                {7,8,9,10}
        };
        // 1. arraydaki 1. eleman
        System.out.println(grid[1][1]);
        // 0. arraydaki 2. eleman
        System.out.println(grid[0][2]);

        String[][] texts = new String[2][3];
        texts[0][1] = "Hello there";

        for (int row=0; row<grid.length; row++){
            for (int col=0; col<grid[row].length; col++){
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }

        //
        String[][] words = new String[2][];
        System.out.println(words[0]);
        words[0] = new String[3];
        words[0][1] = "hi there";
        System.out.println(words[0][1]);
    }
}
