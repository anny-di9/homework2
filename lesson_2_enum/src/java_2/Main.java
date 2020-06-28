package java_2;

import java.util.Calendar;
import java.util.Date;

public class Main {

    //4. Требуется реализовать enum DayOfWeek, который будет представлять дни недели.
    //
    //С его помощью необходимо решить задачу определения кол-ва рабочих часов до конца недели по заднному текущему дню.
    //Возвращает кол-во оставшихся рабочих часов до конца
    //недели по заданному текущему дню. Считается, что
    //текущий день ещё не начался, и рабочие часы за него
    //должны учитываться.
    //public class DayOfWeekMain {
    //public static void main(final String[] args) {
    //System.out.println(getWorkingHours(DayOfWeek.MONDAY));
    //}
    public static void main(String[] args) {


        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        DayOfWeek today = DayOfWeek.convertIntToDay(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("часов до конца рабочей недели: " + getWorkingHours(today));
        System.out.println(getWorkingHours(DayOfWeek.MONDAY));
        System.out.println(getWorkingHours(DayOfWeek.TUESDAY));
        System.out.println(getWorkingHours(DayOfWeek.WEDNESDAY));
        System.out.println(getWorkingHours(DayOfWeek.THURSDAY));
        System.out.println(getWorkingHours(DayOfWeek.FRIDAY));
        System.out.println(getWorkingHours(DayOfWeek.SATURDAY));
        System.out.println(getWorkingHours(DayOfWeek.SUNDAY));
    }

    public static int getWorkingHours(final DayOfWeek currentDay) {
        int hours = 0;
        if (currentDay != DayOfWeek.SUNDAY) {
            for (DayOfWeek day : DayOfWeek.values()) {
                if (day.getDayNumber() >= currentDay.getDayNumber()) {
                    hours += day.getWorkHours();
                }
                //return hours;
            }
        }
        return hours;
    }
}





