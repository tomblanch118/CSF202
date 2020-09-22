import java.util.Collection;
import java.util.ArrayList;

public class Module{
    
    private Collection<Student> students = new ArrayList<Student>();

    public Collection<Student> getStudents() {
        return students;
    }

    public void enrollStudent(Student s){
        students.add(s);
    }

}

