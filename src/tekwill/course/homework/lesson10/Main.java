package tekwill.course.homework.lesson10;

public class Main {
    public static void main(String[] args) {
        for (Calendar.monthsYear month : Calendar.monthsYear.values()) {
            System.out.println(month);
        }
        System.out.println("######################################################################");

        WeekDay weekDay = new WeekDay();
        System.out.println(weekDay.isWeekDay(WeekDay.days.SATURDAY));
        System.out.println(weekDay.isHoliday(WeekDay.days.SATURDAY));
        System.out.println("######################################################################");
    }

}
