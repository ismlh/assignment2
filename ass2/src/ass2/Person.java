
package ass2;

public class Person {
    String name;
    String address;
    String phone_num;
    String e_mail;

    public Person() {
    }

    public Person(String name, String address, String phone_num, String e_mail) {
        this.name = name;
        this.address = address;
        this.phone_num = phone_num;
        this.e_mail = e_mail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public String getE_mail() {
        return e_mail;
    }
   
}
