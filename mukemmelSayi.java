import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        int sayi, sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz :");
        sayi = input.nextInt();
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0)
                sum += i;
        }
        if (sum == sayi)
            System.out.print(sayi + " Mükemmel sayıdır.");
        else
            System.out.print(sayi + " Mükemmel sayı değildir.");
    }
}
