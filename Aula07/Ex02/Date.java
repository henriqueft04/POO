package Aula07.Ex02;

public abstract class Date implements Comparable<Date>{


    public int compareTo(Date umaData){
        if (this.getYear() < umaData.getYear()){
            return -1;
        }
        if (this.getYear() > umaData.getYear()){
            return 1;
        }
        if (this.getMonth() < umaData.getMonth()){
            return -1;
        }
        if (this.getMonth() > umaData.getMonth()){
            return 1;
        }
        if (this.getDay() < umaData.getDay()){
            return -1;
        }
        if (this.getDay() > umaData.getDay()){
            return 1;
        }
        return 0;
    }
    
    public static boolean valid(int day, int month, int year){
        if (year < 0){
            return false;
        }
        if (validMonth(month) == false){
            return false;
        }
        if (day < 1 || day > monthDays(month, year)){
            return false;
        }
        return true;
    }

    public static boolean validMonth(int month){
        if (month < 1 || month > 12){
            return false;
        }
        return true;
    }

    public abstract int getYear();
    public abstract int getMonth();
    public abstract int getDay();

    public static int monthDays(int month, int year){
        int days = 0;
        switch (month){
            case 1: days = 31; break;
            case 2: days = 28; break;
            case 3: days = 31; break;
            case 4: days = 30; break;
            case 5: days = 31; break;
            case 6: days = 30; break;
            case 7: days = 31; break;
            case 8: days = 31; break;
            case 9: days = 30; break;
            case 10: days = 31; break;
            case 11: days = 30; break;
            case 12: days = 31; break;
        }
        if (month == 2 && isLeapYear(year)){
            days = 29;
        }
        return days;
    }

    public static boolean isLeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        }
        return false;
    }

    public abstract void increment();
    public abstract void decrement();
    public abstract String toString();
    


}
