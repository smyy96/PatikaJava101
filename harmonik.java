import java.util.Scanner;

public class harmonik {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n;

        System.out.println("Sayı giriniz: ");
        n = input.nextInt();

        double sum = 0;

        for(int i = 1; i<=n ;i++){
            sum += (1.0/i);
        }

        System.out.println("Sonuç: "+ sum);

    }
    
}
