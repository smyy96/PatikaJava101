import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ebob=1,ekok,count=1,n1,n2;
      
        System.out.print("n1 sayısını giriniz: ");
        n1 = input.nextInt();
      
       System.out.print("n2 sayısını giriniz: ");
       n2 = input.nextInt();
        
        while (true){
            if (n1%count ==0 && n2%count==0){
                ebob=count;
            }
            if(count==n1 || count== n2){
                break;
            }
            count++;
        }
        ekok=(n1*n2) / ebob;
        System.out.println("Ebob: "+ebob);
        System.out.println("Ekok: "+ekok);
    }
}
