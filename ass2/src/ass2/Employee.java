
package ass2;


public class Employee extends Person{
    boolean office;
    double salary;
   String date_hired;

    public Employee() {
    }

    public Employee(boolean office, double salary, String date_hired, String name, String address, String phone_num, String e_mail) {
        super(name, address, phone_num, e_mail);
        this.office = office;
        this.salary = salary;
        this.date_hired = date_hired;
    }

    public void setOffice(boolean office) {
        this.office = office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDate_hired(String date_hired) {
        this.date_hired = date_hired;
    }

    public boolean isOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public String getDate_hired() {
        return date_hired;
    }
    
}
