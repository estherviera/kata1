package software.ulpgc.kata;

import java.time.LocalDate;

public class Main {
    static void main() {
        Person person = new Person("esther", LocalDate.of(2004, 1, 17));
        System.out.println(person);
    }
}
