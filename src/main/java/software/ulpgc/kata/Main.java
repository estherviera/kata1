package software.ulpgc.kata;
import java.time.LocalDate;
import org.w3c.dom.ls.LSOutput;

public class Main {
    static void main() {
        Person person;
        person = new Person("esther", LocalDate.of(2004, 1, 17));
        System.out.println(person);
    }

}
