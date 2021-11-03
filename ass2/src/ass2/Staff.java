
package ass2;


public class Staff extends Employee{
    String title;

    public Staff() {
    }

    public Staff(String title, boolean office, double salary, String date_hired, String name, String address, String phone_num, String e_mail) {
        super(office, salary, date_hired, name, address, phone_num, e_mail);
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    
}
