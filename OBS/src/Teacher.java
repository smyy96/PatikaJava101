public class Teacher {
    String name;
    String mpno;
    String branch;


    Teacher(String name,String branch,String mpno){  //Constructor metot

        this.name=name;
        this.mpno=mpno;
        this.branch=branch;
    }

    void print()
    {
        System.out.println("Adın : "+this.name);
        System.out.println("Telefonu : "+this.mpno);
        System.out.println("Bölümü : "+this.branch);

    }






}
