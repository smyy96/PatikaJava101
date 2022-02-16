import java.util.Arrays;
import java.util.Scanner;
public class ArraySort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num= new int[0];
        int arr;
        System.out.print("Dizinin boyutu n : ");
        int n=scan.nextInt();
        System.out.println("Dizinin elemanlarını giriniz ");
        int[] newarr=Arrays.copyOf(num,n);
        for (int i=0;i<n;i++){
            System.out.print((i+1)+". Elemanı : ");
            arr=scan.nextInt();
            newarr[i]=arr;
        }
        Arrays.sort(newarr);
        System.out.print("Sıralama : ");
        for (int i:newarr) {
            System.out.print(i +" ");
        }

    }
}
