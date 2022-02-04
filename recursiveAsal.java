import java.util.Scanner;
public class recursiveAsal {

    static int asal(int num,int a)
    {
         if(num<2)
             return 0;
         if(a==1)
             return 1;
         else
         {
             if(num % a == 0)
                 return 0;
             else
                 return asal(num, a - 1);
         }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int num = scan.nextInt();
        int status=asal(num,num/2);
        if(status==0)
            System.out.print(num+" Asal degildir.");
        else
            System.out.print(num+" Asal sayidir.");
    }
}
