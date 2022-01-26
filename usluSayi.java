import java.util.Scanner;
public class ustluSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r,sum=1;
        System.out.print("Sayi : ");
        n = input.nextInt();
        System.out.print("Üssü : ");
        r = input.nextInt();
        for(int i=0;i<r;i++) {
            sum*=n;
        }
        System.out.println(n + " üssü " + r + " = " +sum);
    }
}
