import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi1,sayi2, secim;
        System.out.print("İlk sayıyı giriniz :");
        sayi1=input.nextInt();
        System.out.print("İkinci sayıyı giriniz  :");
        sayi2=input.nextInt();

        System.out.print("1.Toplama \n2.Çıkarma \n3.Çarpma \n4.Bölme\n");
        System.out.print("Seçiminiz :");
        secim=input.nextInt();

        switch (secim)
        {
            case 1:
                System.out.print("Toplama: "+(sayi1+sayi2));
                break;
            case 2:
                System.out.print("Çıkarma: "+(sayi1-sayi2));
                break;
            case 3:
                System.out.print("Çarpma: "+(sayi1*sayi2));
                break;
            case 4:
                if(sayi2!=0)
                    System.out.print("Bölme: "+(sayi1/sayi2));
                else
                    System.out.println("Sıfıra Bölünemez");
                break;
        }

    }
}
