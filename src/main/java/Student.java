import java.util.ArrayList;
import java.util.LinkedList;

public class Student {
    private String name;
    private LinkedList<Course> courses;

    public Student(String name){
        this.name = name; //= name.strip();
        this.courses = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public LinkedList<Course> getCourses(){
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
}
