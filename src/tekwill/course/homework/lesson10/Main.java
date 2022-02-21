package tekwill.course.homework.lesson10;

import tekwill.course.homework.lesson12.ParkingCharges;

import java.time.LocalTime;

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

        Converter converter = new Converter();
        converter.setString("5653");
        converter.setNumber(converter.getString());
        System.out.println(converter.getNumber());
        converter.setString("FalsE");
        converter.setaBoolean(converter.getString());
        System.out.println(converter.isaBoolean());



    }


}
