import java.util.Arrays;

public class MatrisTranspoz {

    public static void main(String[] args) {
        int[][] matris= {{1,2,3},{4,5,6}};
        System.out.println("Matris : ");

        for (int row = 0; row < matris.length; row++) {
            for (int column = 0; column < matris[row].length; column++) {
                   System.out.print(matris[row][column]+" ");
                }
            System.out.println("");
        }


        System.out.println("Transpoze : ");

        for (int row = 0; row <matris[0].length ; row++) {
            for (int column = 0; column < matris.length ; column++) {
                System.out.print(matris[column][row]+" ");
            }
            System.out.println("");
        }
    }
}
