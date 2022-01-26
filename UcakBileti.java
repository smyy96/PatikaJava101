import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe,yas,yolculuktipi;
        double ucret=0;

        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculuktipi = input.nextInt();

        if(mesafe>0 && yas>0 && (yolculuktipi == 1 || yolculuktipi==2)) {
            ucret = mesafe*0.10;

            if (yas < 12) {
                ucret = (ucret - (ucret * 0.5));
            } else if (yas >= 12 && yas <= 24) {
                ucret = (ucret - (ucret * 0.1));
            } else if (yas >= 65) {
                ucret = (ucret - (ucret * 0.3));
            }
            if (yolculuktipi == 2) {
                ucret = (ucret - (ucret * 0.2))*2;
            }
            System.out.print("Toplam Tutar: "+ucret+"TL");
        }
        else
            System.out.print("Hatalı Veri Girdiniz !");
    }
}
