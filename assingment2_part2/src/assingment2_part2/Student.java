
package assingment2_part2;

/**
 *
 * @author Islam
 */
public class Student {
    String student_name;
    private int Student_id;
    double student_Gpa;
    Subject subject;
    Adress adress;

    public Student() {
    }
    
    public Student(String student_name, int Student_id, double student_Gpa, Subject subject, Adress adress) {
        this.student_name = student_name;
        this.Student_id = Student_id;
        this.student_Gpa = student_Gpa;
        this.subject = subject;
        this.adress = adress;
    }

    public void setStudent_id(int Student_id) {
        this.Student_id = Student_id;
    }

    public int getStudent_id() {
        return Student_id;
    }
    
}
