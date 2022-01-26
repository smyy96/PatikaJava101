import java.util.Scanner;
public class HavaDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sicaklik;
        System.out.print("Sıcaklık Giriniz:");
        sicaklik = input.nextInt();


        if (sicaklik < 5)
            System.out.print("Kayak yapmalısın.");
        else if (sicaklik >= 5 && sicaklik < 15)
            System.out.print("Sinemaya gitmelisin");
        else if (sicaklik >= 15 && sicaklik < 25)
            System.out.print("Piknik yapmalısın.");
        else
            System.out.print("Yüzmeye gitmelisin.");
    }
}
