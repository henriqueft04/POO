package Aula07.Ex02;

public class DateND extends Date {

    //privates
    private int daysSince2000;
    

    // Construtor
    public DateND(int daysSince2000) {
        this.daysSince2000 = daysSince2000;
    }

    public void increment() {
        daysSince2000++;
    }

    public void decrement() {
        daysSince2000--;
    }

    public String toString() {
        int year = 2000, month = 1, day = 1;
        while (daysSince2000 > 0) {
            int daysInMonth = monthDays(month, year);
            if (daysSince2000 >= daysInMonth) {
                daysSince2000 -= daysInMonth;
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                }
            } else {
                day += daysSince2000;
                daysSince2000 = 0;
            }
        }
        return String.format("%04d-%02d-%02d", year, month, day);
    }

    public int getDaysSince2000() {
        return daysSince2000;
    }

    public void setDaysSince2000(int daysSince2000) {
        this.daysSince2000 = daysSince2000;
    }

    public int getYear(){
        int year = 2000, month = 1;
        while (daysSince2000 > 0) {
            int daysInMonth = monthDays(month, year);
            if (daysSince2000 >= daysInMonth) {
                daysSince2000 -= daysInMonth;
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                }
            } else {
                daysSince2000 = 0;
            }
        }
        return year;
    }

    public int getMonth(){
        int year = 2000, month = 1;
        while (daysSince2000 > 0) {
            int daysInMonth = monthDays(month, year);
            if (daysSince2000 >= daysInMonth) {
                daysSince2000 -= daysInMonth;
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                }
            } else {
                daysSince2000 = 0;
            }
        }
        return month;
    }

    public int getDay(){
        int year = 2000, month = 1, day = 1;
        while (daysSince2000 > 0) {
            int daysInMonth = monthDays(month, year);
            if (daysSince2000 >= daysInMonth) {
                daysSince2000 -= daysInMonth;
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                }
            } else {
                day += daysSince2000;
                daysSince2000 = 0;
            }
        }
        return day;
    }

    public static DateND fromDateYMD(DateYMD date) {
        int year = date.getYear();
        int month = date.getMonth();
        int day = date.getDay();
        int daysSince2000 = daysBetween(year, month, day, 2000, 1, 1);
        return new DateND(daysSince2000);
    }

    public static int daysBetween(int year1, int month1, int day1, int year2, int month2, int day2) {
        
        int days = 0;
        int year = year1;
        int month = month1;
        int day = day1;
        while (year < year2 || month < month2 || day < day2) {
            days++;
            day++;
            if (day > monthDays(month, year)) {
                day = 1;
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
                }
            }
        }
        return days;
    }
}
