public class Tekraredensayi {
    public static void main(String[] args) {
        int cf=0;
        int[] num = {1,2,4,10,3,5,2,1,5,11,8,9,2,2};
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                if(num[i]==num[j]){
                    cf++;
                }
            }
            if(cf%2==0)
            {
                System.out.print(num[i]+" ");
            }
            cf=0;
        }
    }
}
