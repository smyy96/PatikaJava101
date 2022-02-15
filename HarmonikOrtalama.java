public class HarmonikOrtalama {
    
    public static void main(String[] args) {
        
        double[] num= {2,4,6,10};
        double sum=0;
        
        for (double i:num) {
            sum += (1/i);
        }
        
        System.out.println(num.length/sum);
    }
}
