package tekwill.course.homework.lesson15;

import tekwill.course.homework.lesson15.util.Validation;

public class Date {
    Validation validation = new Validation();
    private int date;
    private int month;
    private long year;


    public Date(int date, int month, long year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }
}
