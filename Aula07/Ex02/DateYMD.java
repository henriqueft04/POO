package Aula07.Ex02;

public class DateYMD extends Date{
    //criar as privates
    private int day;
    private int month;
    private int year;

    //contrutor
    public DateYMD(int day, int month, int year) {
        if (valid(day, month, year) == false) {
            System.out.print("Data invalida ");
            System.exit(1);
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }
    

    public void set(int day, int month, int year) {
        if (valid(day, month, year) == false) {
            System.out.print("Data invalida ");
            System.exit(1);
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //consultar os valores do dia, mês e ano (day, month, year);

    public int getDay() {
        return day;
    }
    
    public int getMonth() {
        return month;
    }
    
    public int getYear() {
        return year;
    }

    //incrementar a data (increment)

    public void increment() {
        day +=1;
        if (day > monthDays(month, year)){
            month += 1;
            day = 1 ;
            if ( month > 12){
                month = 1;
                day = 1;
                year += 1;
            }
        }
    }

    //decrementar a data (decrement)

    public void decrement() {
        day -=1;
        if (day < 1){
            month -= 1;
            if ( month < 1){
                month = 12;
                day = 31;
                year -= 1;
            }
            else{
                day = monthDays(month, year);
            }
        }
    }
 
    // método toString que devolva a data no formato AAAA-MM-DD

    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }

}
