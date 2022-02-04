import java.util.Scanner;
public class Desen {

    static int a=0;
    static void desen(int num,int nm)
    {
        System.out.print(num+" ");

        if(num>0 && a==0)
        {
            desen(num-5,nm);
        }
        else if (num<=0 || a==1)
        {
            a=1;
            if(num<nm)
                desen(num+5,nm);
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int num = scan.nextInt();
        desen(num,num);
    }
}
