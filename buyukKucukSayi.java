import java.util.Scanner;

public class buyukKucukSayi {
    public static void main(String[] args) {
        int sayi,alinan,max=0,min=0, minn=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz :");
        sayi = input.nextInt();

        for(int i=1;i<=sayi;i++)
        {
            System.out.print(i+". sayıyı giriniz: ");
            alinan = input.nextInt();
            if(alinan>max)
            {
                max=alinan;
            }
            else{
                min=alinan;
                if(min<=minn)
                    minn=min;
            }
        }
        System.out.println("En büyük sayı: "+max);
        System.out.print("En küçük sayı: "+min);
    }
}
