

public class Main {
    public static void main(String[] args){

        Teacher t1=new Teacher("mahmut","TRH","5555");

        Teacher t2=new Teacher("ibrahim erkal","FZK","333");

        Teacher t3=new Teacher("Mahmut Tuncel","MZK","1258");

        Course tarih=new Course("tarih","101","TRH");
        tarih.addTeacher(t1);
        Course fizik=new Course("fizik","102","FZK");
        fizik.addTeacher(t2);
        Course muzik=new Course("muzik","103","MZK");
        muzik.addTeacher(t3);


        Student s1=new Student("Sümeyye","123","4",tarih,fizik,muzik);
        s1.addBulkExamNote(100,75,50);
        s1.addBulkQuizNote(20,10,50);
        s1.isPass();
        s1.printNote();

        Student s2=new Student("Burhan Altıntop","113","4",tarih,fizik,muzik);
        s2.addBulkExamNote(50,30,70);
        s2.addBulkQuizNote(100,75,80);
        s2.isPass();
        s2.printNote();
    }
}
