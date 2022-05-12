import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    char matrix[][];
    String NumField[][];
    public void Run() {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen satır giriniz: ");
        int line = input.nextInt();
        System.out.print("Lütfen sütun giriniz: ");
        int column = input.nextInt();

        createField(line, column);// Boş tarla oluşturma
        AddMines(line, column); // Mayın Ekleme
        ShowField(line, column); // Tarlanın Mayınlı Halini Gösterme




        int loopSize=(line*column)-(int)((line*column)/4);
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        while (loopSize>0)
        {

            for (int i = 0; i < line; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print(NumField[i][j] + " ");
                }
                System.out.print("\n");
            }
            int sum = 0;
            System.out.print("Satır giriniz: ");
            int line1 = (input.nextInt()) - 1;
            System.out.print("Sütun giriniz: ");
            int column2 = (input.nextInt()) - 1;
            if (line >= line1 && column >= column2 && line1 >= 0 && column2 >= 0) {
                if (matrix[line1][column2] == '*') {
                    System.out.println("Game Over!");
                    break;
                }
                else
                {
                    if (line1 - 1 >= 0 && column2 - 1 >= 0)
                        if (matrix[line1 - 1][column2 - 1] == '*')
                            sum++;

                    if (line1 - 1 >= 0)
                        if (matrix[line1 - 1][column2] == '*')
                            sum++;

                    if (line1 - 1 >= 0 && column2 + 1 < column)
                        if (matrix[line1 - 1][column2+1] == '*')
                            sum++;

                    if (column2 - 1 >= 0)
                        if (matrix[line1][column2-1] == '*')
                            sum++;

                    if (column2 + 1 <column)
                        if (matrix[line1][column2+1] == '*')
                            sum++;

                    if (line1 + 1 < line && column2 - 1 >= 0)
                        if (matrix[line1 +1][column2-1] == '*')
                            sum++;

                    if (line1 + 1 < line)
                        if (matrix[line1 + 1][column2] == '*')
                            sum++;

                    if (line1 + 1 < line && column2 + 1 < column)
                        if (matrix[line1 + 1][column2+1] == '*')
                            sum++;


                    NumField[line1][column2] = String.valueOf(sum);
                }
            }
            else
            {
                System.out.println("Yanlış değer girdiniz.");
            }

            System.out.println("=======================");
            loopSize--;

            if (loopSize==0){
                System.out.println("Oyunu Kazandınız !");

                for (int i = 0; i < line; i++) {
                    for (int j = 0; j < column; j++) {
                        System.out.print(NumField[i][j] + " ");
                    }
                    System.out.print("\n");
                }

            }
        }


    }

    public void createField(int line,int column) // Tarlayı oluşturma
    {
        matrix = new char[line][column];//normal dizi mayınsız
        NumField=new String[line][column]; // kullanıcıya gösterilecek dizi
        for (int i=0;i<line;i++){
            for (int j=0;j<column;j++){
                matrix[i][j]='-';
                NumField[i][j]="-";

            }
        }
    }

    public void AddMines(int line,int column) // Mayın ekleme
    {
        int minesNum=(int)((line*column)/4);

        for (int i=0;i<minesNum;i++) // Mayın ekleme
        {
            int randomX=(int)(Math.random()*line);
            int randomY=(int)(Math.random()*column);
            if (matrix[randomX][randomY]=='*'){
                minesNum++;
            }
            else {
                matrix[randomX][randomY]='*';
            }
        }
    }

    public void ShowField(int line,int column) // Tarlanın mayınlı halini gösterme
    {
        System.out.println("Mayınların Konumu");
        for (int i=0;i<line;i++){
            for (int j=0;j<column;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("=======================");
    }
}
