package tekwill.course.homework.lesson10;


public class WeekDay {
    enum days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
        FRIDAY, SATURDAY, SUNDAY
    }

    public boolean isWeekDay(days days) {
        return days != WeekDay.days.SUNDAY && days != WeekDay.days.SATURDAY;
    }
    public boolean isHoliday(days days) {
        return days == WeekDay.days.SUNDAY || days == WeekDay.days.SATURDAY;
    }

}
