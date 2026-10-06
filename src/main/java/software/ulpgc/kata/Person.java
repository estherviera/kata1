package software.ulpgc.kata;

import java.time.LocalDate;

public class Person {
    private final String name;
    private  final LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int age(){
        return toYear(LocalDate.now().toEpochDay() - birthday.toEpochDay());
    }

    public int toYear(long day){
        return (int) (day / 365.25);
    }

    @Override
    public String toString() {
        return "Person { " + "name="+ name + ", age =" + age() + "}";
    }
}
