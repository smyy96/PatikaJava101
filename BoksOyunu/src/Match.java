import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }

    void run(){
        if(ischeck()){
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== YENİ ROUND ===========");
                if(startedPlay()){
                    this.f2.health = this.f1.hit(this.f2);
                    if(isWin()){
                        break;
                    }
                    this.f1.health = this.f2.hit(this.f1);
                    if(isWin()){
                        break;
                    }
                }
                else{
                    this.f1.health = this.f2.hit(this.f1);
                    if(isWin()){
                        break;
                    }
                    this.f2.health = this.f1.hit(this.f2);
                    if(isWin()){
                        break;
                    }

                }

                System.out.println(this.f1.name+" Sağlık : "+this.f1.health);
                System.out.println(this.f2.name+" Sağlık : "+this.f2.health);
            }
        }

        else{
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }

    boolean ischeck() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }


    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println("Maçı Kazanan : " + this.f2.name);
            return true;
        }
        else if (this.f2.health == 0){
            System.out.println("Maçı Kazanan : " + this.f1.name);
            return true;
        }

        return false;
    }

    boolean startedPlay(){// ilk kim başlayacak

        double Random=Math.random();
        if(Random > 0.5){
            System.out.println(this.f1.name+ " ilk başlayacaktır.");
            return true;
        }

        else {
            System.out.println(this.f2.name+ " ilk başlayacaktır.");
            return false;
        }

    }
}
