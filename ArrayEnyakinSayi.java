import java.util.Scanner;
import java.util.Arrays;
public class ArrayEnyakinSayi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num={15,12,788,1,-1,-778,2,0};
        Arrays.sort(num);
        System.out.print("Sayı giriniz:");
        int min=0,max=0;
        int nm = scan.nextInt();

        for (int i:num) {
            if(i<nm){
                min=i;
            }
            else if(i>nm){
                max=i;
                break;
            }

        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+min);
        System.out.println(Arrays.toString(num));
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+max);
    }

}
