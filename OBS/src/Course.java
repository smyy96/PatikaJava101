public class Course {

    Teacher teacher;// teacher sınıfından nitelik oluşturduk.
    String name;
    String code;
    String prefix;
    int quiz;
    int note;

    Course(String name, String code, String prefix){
        this.name=name;
        this.prefix=prefix;
        this.code=code;
        int note =0;
        int quiz=0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix))//stringlerin eşitliğini kontrol ediyor equals ile
        {
            this.teacher=teacher;
        }
        else{
            System.out.println("Öğretmen ve ders uyuşmuyor.");
        }
    }

    void printTeacher(){
        this.teacher.print();
    }


}
