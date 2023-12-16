package Aula05;
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        int choice, day, month, year;
        DateYMD date = null;
        do {
            System.out.println("Date operations:");
            System.out.println("1 - create new date");
            System.out.println("2 - show current date");
            System.out.println("3 - increment date");
            System.out.println("4 - decrement date");
            System.out.println("0 - exit");
            choice = tec.nextInt();

        switch(choice){
            case 1:
                do{              
                    System.out.print("Day: ");
                        day = tec.nextInt();
                    System.out.print("Month: ");
                        month = tec.nextInt();
                    System.out.print("Year: ");
                        year = tec.nextInt();
                    
                    if (DateYMD.valid(day, month, year) == false){
                            System.out.println("Invalid date, try again");
                        }
                }
                while (DateYMD.valid(day, month, year) == false);
                
                date = new DateYMD(day, month, year);

                break;
                
                case 2:
                    if (date == null){
                        System.out.println("No date provided ");
                        System.exit(1);
                    }
                    System.out.println("Current date: " + date.toString());
                    break;

                case 3:
                    if (date == null){
                        System.out.println("No date provided ");
                        System.exit(1);
                    }
                    date.increment();
                    System.out.println("New date with the increment: " + date.toString());
                    break;
                
                case 4:
                    if (date == null){
                        System.out.println("No date provided ");
                        System.exit(1);
                    }
                    date.decrement();
                    System.out.println("New date with the decrement: " + date.toString());
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
