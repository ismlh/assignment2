
package ass2;


public class Faculty extends Employee{
    int office_hours;
    String rank;

    public Faculty() {
    }

    public Faculty(int office_hours, String rank, boolean office, double salary, String date_hired, String name, String address, String phone_num, String e_mail) {
        super(office, salary, date_hired, name, address, phone_num, e_mail);
        this.office_hours = office_hours;
        this.rank = rank;
    }

    public void setOffice_hours(int office_hours) {
        this.office_hours = office_hours;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getOffice_hours() {
        return office_hours;
    }

    public String getRank() {
        return rank;
    }
    
}
