import java.util.Map;
import java.util.HashMap;

public class Gradebook extends Course{
    private Map<Student, Double> students;

    // Default constructor, automatically populates gradebook
    protected Gradebook(){
        this.students = new HashMap<Student, Double>();
    }

    protected void add(Student student){
        students.put(student, (double) -1);
    }

    protected void display(){
        for(Map.Entry<Student, Double> s : students.entrySet()){
            System.out.println(s.getKey().getName() + ":\t" + s.getValue());
        }
    }

    protected double getGrade(String name){
        for(Map.Entry<Student, Double> s : students.entrySet()){
            if(s.getKey().getName().equals(name)) return s.getValue();
        }
        System.err.println("Student not found.");
        return -1;
    }

    protected boolean setGrade(String name, double grade){
        for(Map.Entry<Student, Double> s : students.entrySet()){
            if(s.getKey().getName().equals(name)) {
                s.setValue(grade);
                return true;
            }
        }
        System.err.println("Student not found.");
        return false;
    }
}
