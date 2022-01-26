import java.util.Scanner;
//tek sayı girilene kadar calısan
public class Teksayıgirilene {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, n;
        do {
            System.out.print("Sayi Giriniz : ");
            n = input.nextInt();
            if (n % 4 == 0 && n % 2 == 0) {
                sum += n;
            }
        }while (n%2==0);

        System.out.print("Toplam: "+(sum));
    }
}
