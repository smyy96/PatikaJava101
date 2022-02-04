import java.util.Scanner;
public class recursiveUs {

    static  int usAlma(int taban, int us)
    {
        if(us==0)
            return 1;
        else
            return taban * usAlma(taban,(us-1));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int taban = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int us = scan.nextInt();
        System.out.print(usAlma(taban,us));
    }
}
