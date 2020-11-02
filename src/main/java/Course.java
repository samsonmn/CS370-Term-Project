import java.util.LinkedList;

public class Course {
    private String name;
    private LinkedList<Student> listOfStudents;
    private Gradebook gradebook;

    // constructor
    public Course(String name){
        this.name = name;
        this.listOfStudents = new LinkedList<>();
        gradebook = new Gradebook();
    }

    // default constructor
    public Course() {}

    public void displayGrades(){
        gradebook.display();
    }

    public String toString() {
        return name;
    }

    public LinkedList<Student> getStudents() {
        return listOfStudents;
    }

    public void addStudent(Student student){
        listOfStudents.add(student);
        gradebook.add(student);
    }
}
