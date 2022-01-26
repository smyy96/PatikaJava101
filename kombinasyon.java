import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r, nr = 1,nT=1,rT=1;
        System.out.print("N : ");
        n = input.nextInt();
        System.out.print("R : ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            nT *= i;
        }
        for (int x = 1; x <= r; x++) {
            rT *= x;
        }
        for (int y = 1; y <= (n - r); y++) {
            nr *= y;
        }

        System.out.println("C(" + n + "," + r + ")= " + (nT / (rT * nr)));
        //C(n,r) = n! / (r! * (n-r)!)

    }
}
