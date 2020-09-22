public class Main{

    public static void main(String[] args){
        Module module = new Module();
        module.enrollStudent(new Student("Tom"));
        module.enrollStudent(new Student("Sam"));

        for(Student student: module.getStudents()) {
            student.doStudentThings();
        }

    }

}
