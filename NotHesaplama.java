import java.util.Scanner;
public class NotHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, turk, kimya, muzık, fizik;
        int toplam = 0, count = 0;

        System.out.print("Matematik Notu:");
        mat = input.nextInt();

        System.out.print("Türkçe Notu:");
        turk = input.nextInt();

        System.out.print("Kimya Notu:");
        kimya = input.nextInt();

        System.out.print("Fizik Notu:");
        fizik = input.nextInt();

        System.out.print("Müzik Notu:");
        muzık = input.nextInt();

        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            count++;
        }

        if (turk >= 0 && turk <= 100) {
            toplam += turk;
            count++;
        }
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            count++;

        }
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            count++;

        }
        if (muzık >= 0 && muzık <= 100) {
            toplam += muzık;
            count++;
        }

        System.out.print("Ortalama: "+(toplam/count));
    }
}
