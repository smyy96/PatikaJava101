import java.util.Scanner;
public class büyüksayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi1, sayi2, sayi3, enbuyuk;
        System.out.print("1.Sayı: ");
        sayi1 = input.nextInt();
        System.out.print("2.Sayı: ");
        sayi2 = input.nextInt();
        System.out.print("3.Sayı: ");
        sayi3 = input.nextInt();

        if (sayi1 > sayi2 && sayi1 > sayi3) {
            if (sayi2 > sayi3)
                System.out.print(sayi1 + ">" + sayi2 + ">" + sayi3);
            else
                System.out.print(sayi1 + ">" + sayi3 + ">" + sayi2);
        }

        if (sayi2 > sayi1 && sayi2 > sayi3) {
            if (sayi1 > sayi3)
                System.out.print(sayi2 + ">" + sayi1 + ">" + sayi3);
            else
                System.out.print(sayi2 + ">" + sayi3 + ">" + sayi1);
        }

        if (sayi3 > sayi2 && sayi3 > sayi1) {
            if (sayi1 > sayi2)
                System.out.print(sayi3 + ">" + sayi1 + ">" + sayi2);
            else
                System.out.print(sayi3 + ">" + sayi1 + ">" + sayi2);
        }

    }
}
