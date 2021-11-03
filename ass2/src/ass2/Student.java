
package ass2;


public class Student extends Person {
  final String Student_state1="freshman";
  final String Student_state2="sophomore";
  final String Student_state3="junior";
  final String Student_state4="senoir";

    public Student(String name, String address, String phone_num, String e_mail) {
        super(name, address, phone_num, e_mail);
    }

    public String getStudent_state1() {
        return Student_state1;
    }

    public String getStudent_state2() {
        return Student_state2;
    }

    public String getStudent_state3() {
        return Student_state3;
    }

    public String getStudent_state4() {
        return Student_state4;
    }

 
}
