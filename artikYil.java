import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yil,artik=0, artikY=0;
        System.out.print("Yıl Giriniz : ");
        yil = input.nextInt();

        artik=yil%4;
        artikY=yil%100;

        if (artik==0)
            if ((artikY==0)&&(yil%400==0))
                System.out.print(yil+" bir artık yıldır !");
            else if((artikY==0)==false)
                System.out.print(yil+" bir artık yıldır !");
            else
                System.out.print(yil+" bir artık yıl değildir !");
        else
            System.out.print(yil+" bir artık yıl değildir !");
    }
}
