import java.util.Arrays;

public class DiziFrenkansi {
    public static void main(String[] args) {
        int cf=0;
        int[] num = {1,2,4,10,3,5,2,1,5,11,8,9,2,2};
        Arrays.sort(num);
        System.out.println("Tekrar Sayıları ");
        System.out.println(Arrays.toString(num));
        int a=0;
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                if(num[i]==num[j]){
                    cf++;
                }
            }

            if(num[i]!=num[i+1]){
                System.out.println(num[i]+" sayısı "+cf+" kere tekrara edildi.");
            }
            if(num[i] == num[num.length-1] && i == num.length-2 ) {
                System.out.println(num[num.length-1] + " sayısı " + cf + " kez tekrar edildi. ");
            }
            cf=0;
        }
    }
}
