package java_2;

public enum DayOfWeek {

    MONDAY("Понедельник",1,4),
    TUESDAY("Вторник",2,5),
    WEDNESDAY("Среда",3, 6),
    THURSDAY("Четверг",4,2),
    FRIDAY("Пятница",5, 7),
    SATURDAY("Суббота",6,0),
    SUNDAY("Воскресенье", 7, 0);

    public String title;
    private final int dayNumber;
    private final int workHours;


    DayOfWeek (String title, int dayNumber, int workHours){
        this.dayNumber = dayNumber;
        this.workHours = workHours;

    }
    public int getWorkHours(){
        return this.workHours;
    }

    public int getDayNumber(){
        return this.dayNumber;
    }

    public String getTitle() {
        return title;
    }

    static DayOfWeek convertIntToDay (int number){
        for(DayOfWeek day: values())
            if(day.dayNumber == number)
                return day;
        return null;
    }
}