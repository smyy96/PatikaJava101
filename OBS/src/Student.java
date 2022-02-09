public class Student {
    Course c1;
    Course c2;
    Course c3;

    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name,String stuNo,String classes, Course c1,Course c2, Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0.0;
        this.isPass=false;
    }


    void addBulkExamNote(int note1, int note2,int note3){
        if(note1>=0 && note1<=100)
             this.c1.note=note1;
        if(note2>=0 && note2<=100)
            this.c2.note=note2;
        if(note3>=0 && note3<=100)
            this.c3.note=note3;
    }

    void addBulkQuizNote(int q1,int q2, int q3){
        if(q1>=0 && q1<=100)
            this.c1.quiz=q1;
        if(q2>=0 && q2<=100)
            this.c2.quiz=q2;
        if(q3>=0 && q3<=100)
            this.c3.quiz=q3;
    }

    void  isPass()
    {
        System.out.println("-------------------");
        this.avarage=(((this.c1.note*0.8)+(this.c1.quiz*0.2))+((this.c2.note*0.8)+(this.c2.quiz*0.2))+((this.c3.note*0.8)+(this.c3.quiz*0.2))/3.0);
        if(this.avarage>55){
            System.out.println("Geçtin");
            this.isPass=true;
        }

        else{
            this.isPass=false;
            System.out.println("Kaldın");
        }

    }


    void  printNote()
    {
        System.out.println(this.c1.name+" Notu\t:\t"+c1.note+" | Sözlü Notu\t:\t"+c1.quiz);
        System.out.println(this.c2.name+" Notu\t:\t"+c2.note+" | Sözlü Notu\t:\t"+c2.quiz);
        System.out.println(this.c3.name+" Notu\t:\t"+c3.note+" | Sözlü Notu\t:\t"+c3.quiz);
        System.out.println("Ortalamanız:\t"+this.avarage);
    }
}
