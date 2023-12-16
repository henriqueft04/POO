package Aula05;
import java.util.Scanner;

public class Main02 {
    
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        int choice, firstWeekdayOfYear, year;
        Calendario calendar = null;
        
        do {
            System.out.println("Calendar operations:");
            System.out.println("1 - create new calendar");
            System.out.println("2 - print calendar month");
            System.out.println("3 - print calendar");
            System.out.println("4 - add event");
            System.out.println("5 - remove event");
            System.out.println("6 - show events");
            System.out.println("0 - exit");
            choice = tec.nextInt();
            
            switch(choice){
                case 1:
                    do{              
                        System.out.print("Year: ");
                        year = tec.nextInt();
                        System.out.print("First Weekday of that year: ");
                            firstWeekdayOfYear = tec.nextInt();
                        
                        if (firstWeekdayOfYear <0 || firstWeekdayOfYear > 7){
                                System.out.println("Invalid First Weekday, try again");
                            }
                    }
                    while (firstWeekdayOfYear <0 || firstWeekdayOfYear > 7);    
                    
                    calendar = new Calendario(year, firstWeekdayOfYear);

                    break;
                    
                case 2:
                    if (calendar == null) {
                        System.out.println("Save a calender first!");
                        System.exit(1);
                    } 
                    System.out.print("Enter the month that you want to print(1-12): ");
                    int month = tec.nextInt();
                    System.out.print(calendar.printMonth(month));


                    break;

                case 3:
                    if (calendar == null) {
                        System.out.println("Save a calender first!");
                        System.exit(1);
                    } 
                    System.out.println(calendar.toString());

                    break;
                
                case 4:
                    if (calendar == null) {
                        System.out.println("Save a calender first!");
                        System.exit(1);
                    } 
                    System.out.println("Insert the event date: ");
                    System.out.print("Day: ");
                    int dia = tec.nextInt();
                    System.out.print("Month: ");
                    int mes = tec.nextInt();
                    System.out.print("Year: ");
                    int ano = tec.nextInt();
                    DateYMD date = new DateYMD(dia, mes, ano);
                    calendar.addEvent(date);


                    break;
                
                case 5:
                    if (calendar == null) {
                        System.out.println("Save a calender first!");
                        System.exit(1);
                    } 
                    System.out.println("Insert the event date: ");
                    System.out.print("Day: ");
                    dia = tec.nextInt();
                    System.out.print("Month: ");
                    mes = tec.nextInt();
                    System.out.print("Year: ");
                    ano = tec.nextInt();
                    date = new DateYMD(dia, mes, ano);
                    calendar.removeEvent(date);
                
                    break;


                case 6:
                    if (calendar == null) {
                        System.out.println("Save a calender first!");
                        System.exit(1);
                    }
                    calendar.showEvents();

                    break;
                case 0:
                    System.out.println("Program ended");
                    break;

                default:
                    System.out.println("Thats not a valid option, try again.");
                    break;
            }
                
                

            }
            while ( choice != 0);

            tec.close();
        }
}
