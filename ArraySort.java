import java.util.Arrays;
import java.util.Scanner;
public class ArraySort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr;
        System.out.print("Dizinin boyutu n : ");
        int n=scan.nextInt();
        int[] num= new int[n];
        System.out.println("Dizinin elemanlarını giriniz ");
        for (int i=0;i<n;i++){
            System.out.print((i+1)+". Elemanı : ");
            arr=scan.nextInt();
            num[i]=arr;
        }
        Arrays.sort(newarr);
        System.out.print("Sıralama : ");
        for (int i:num) {
            System.out.print(i +" ");
        }

    }
}
