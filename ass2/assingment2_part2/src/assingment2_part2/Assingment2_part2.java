
package assingment2_part2;

/**
 *
 * @author Islam
 */
public class Assingment2_part2 {

    public static void main(String[] args) {
       Subject sub1=new Subject("c++","777",3);
       Adress ad=new  Adress(3,"mm","minya");
       Student s1=new Student("islam",888,2.5,sub1,ad);
       System.out.println(s1.getStudent_id());
    }
    
}
