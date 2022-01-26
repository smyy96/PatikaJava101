//4 ve 5'in kuvvetlerini bulma.
import java.util.Scanner;
public class kuvvet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Sayi Giriniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
