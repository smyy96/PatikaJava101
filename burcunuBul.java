import java.util.Scanner;
public class burcunuBul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gun,ay;
        System.out.print("Doğum ayınız: ");
        ay = input.nextInt();

        System.out.print("Doğum gününüz: ");
        gun = input.nextInt();

        if((ay==4 && gun<=20)||(ay==3&&gun>=21))
            System.out.print("Koç Burcu");
        else if ((ay == 12 & gun >= 12) || (ay == 1 & gun <= 20))
            System.out.print("Oğlak Burcu");
        else if ((ay == 9 & gun >= 22) || (ay == 10 & gun <= 23))
            System.out.print("Terazi Burcu");
        else if ((ay == 1 & gun >= 21) || (ay == 2 & gun <= 19))
            System.out.print("Kova Burcu");
        else if ((ay == 2 & gun >= 20) || (ay == 3 & gun <= 20))
            System.out.print("Balık Burcu");
        else if ((ay == 4 & gun >= 21) || (ay == 5 & gun <= 21))
            System.out.print("Boğa Burcu");
        else if((ay == 5 & gun >= 22) || (ay == 6 & gun <= 21))
            System.out.print("İkizler Burcu");
        else if ((ay == 6 & gun >= 22) || (ay == 7 & gun <= 23))
            System.out.print("Yengeç Burcu");
        else if ((ay == 7 & gun >= 24) || (ay == 8 & gun <= 23))
            System.out.print("Aslan Burcu");
        else if ((ay == 8 & gun >= 24) || (ay == 9 & gun <= 23))
            System.out.print("Başak Burcu");
        else if ((ay == 102 & gun >= 23) || (ay == 11 & gun <= 22))
            System.out.print("Akrep Burcu");
        else
            System.out.print("Yay Burcu");
    }
}
