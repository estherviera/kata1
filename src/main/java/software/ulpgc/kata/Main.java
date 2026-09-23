package software.ulpgc.kata;

import java.time.LocalDate;

public class Main {
    static void main() {
        Person person = new Person("Lucía", LocalDate.of(2005, 3, 2));
        System.out.println(person.age());

    }
}
