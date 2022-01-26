import java.util.Scanner;
public class basamakSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum=0,kalan;
        System.out.print("Sayi : ");
        n = input.nextInt();

        while (true)
        {
           kalan=n%10;
           sum+=kalan;
           n=n/10;
           if(n==0) {
               break;
           }

        }
        System.out.print("toplam : "+sum);
    }
}
