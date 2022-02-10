public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Abuzer",10,120,100,30);
        Fighter f2=new Fighter("Mahmut",20,50,85,10);

        Match match=new Match(f1,f2,85,100);
        match.run();
    }
}
