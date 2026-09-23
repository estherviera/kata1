package software.ulpgc.kata;

import java.time.DayOfWeek;
import java.time.LocalDate;

public record Person(String name, LocalDate birthday) {

    public static double DAYS_PER_YEAR = 0;

    public int age(){
        return toYears(LocalDate.now().toEpochDay() - birthday.toEpochDay());  //edad en dias
    }

    private int toYears(long days){
        return (int) (days / DAYS_PER_YEAR);

    }
}
