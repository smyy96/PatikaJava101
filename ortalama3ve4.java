//3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program

import java.util.Scanner;

public class ortalamaSayi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, count = 0, n;

        System.out.print("Sayi Giriniz : ");
        n = input.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % 4 == 0 && i % 3 == 0) {
                sum += i;
                count++;
            }
        }

        System.out.print("Ortalama: "+(sum/count));

    }
}
