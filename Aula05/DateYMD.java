package Aula05;

public class DateYMD {
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
    
    // um método booleano que indique se o valor inteiro que represente um mês ([1;12]) é válido: validMonth(int month)
    public static boolean validMonth(int month){
        if (month > 0 && month <13){
            return true;
        }
        return false;     
    }

    //um método inteiro que devolva o número de dias de um determinado mês, num determinado ano: monthDays(int month, int year)
    public static int monthDays(int month, int year){
        int diasMes;
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diasMes = 31;
                break;
            case 2:
                if (leapYear(year)==true){
                    diasMes = 29;
                    break;
                }
                else{
                    diasMes = 28;
                    break;
                }
            default:
                diasMes = 30;
                break;
        }   
        return diasMes;
    }

    //um método booleano que indique se um ano é bissexto: leapYear(int year)
    public static boolean leapYear(int year){
        if (year % 4 == 0 && year % 100!=0 && year % 400 == 0){
            return true;
        }
        return false;
    }

    //um método booleano que indique se uma data composta por dia, mês e ano, é válida: valid(int day, int month, int year) 
    public static boolean valid(int day, int month, int year){
        if (!validMonth(month)) {
            return false;
        }
        if (day < 1 || day > monthDays(month, year)) {
            return false;
        }
        return true;
    }

    //definir uma data: set(int day, int month, int year)

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
