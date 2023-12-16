    package Aula05;

    public class Calendario {

        //criar as privates
        private int year;
        private int[][] events;
        private int firstWeekdayOfYear;

        //construtor
        public Calendario(int year, int firstWeekdayOfYear) {
            this.year = year;
            this.firstWeekdayOfYear = firstWeekdayOfYear;
            events = new int[12][31];
        }
        
        //métodos que devolvem esses dados (consultas/getters): year() e firstWeekdayOfYear()
        public int getYear() {
            return year;
        }

        public int getFirstWeekdayOfYear() {
            return firstWeekdayOfYear;
        }

        //um método que devolva o dia da semana em que começa um dado mês (no ano do calendário): firstWeekdayOfMonth(month); 
        public int getFirstWeekdayOfMonth(int month) {
            int days = 0;
            for (int i = 1; i < month; i++) {
                days += DateYMD.monthDays(i, year);
            }
            int weekday = (firstWeekdayOfYear + days) % 7;
            return weekday;

        }

        // métodos que permitam adicionar/remover um evento numa data: addEvent(DateYMD); removeEvent(DateYMD);
        public void addEvent(DateYMD date){
            if (date.getYear() != year || date==null) {
                System.out.print("Date does not belong to the current year");
                System.exit(0);
            }
            int month = date.getMonth()-1;
            int day = date.getDay()-1;
            this.events[month-1][day-1]++;
            System.out.println("Event has been added");
        }

        public void removeEvent(DateYMD date) {
            if (date.getYear() != year) {
                System.out.println("Date does not belong to the current year");
                return;
            }
            int month = date.getMonth()-1;
            int day = date.getDay()-1;
            if (this.events[month-1][day-1] > 0) {
                this.events[month-1][day-1]--;
                System.out.println("Event had been removed");
            }
            else {
                System.out.println("No events left");
            }
        }

        // método que exibe os eventos com suas datas e descrições
        public void showEvents() {
            System.out.println("Events:");
            for (int i = 0; i < events.length; i++) {
                for (int j = 0; j < events[i].length; j++) {
                    if (events[i][j] > 0) {
                        System.out.printf("%02d/%02d/%d - %d events\n", j+1, i+1, year, events[i][j]);
                    }
                }
            }
        }
        


        // método toString que devolva a representação de um mês de calendário: printMonth(month); nesta representação, cada dia deve ser precedido de * caso exista pelo menos um evento agendado nessa data; 
        public String printMonth(int month){
            StringBuilder monthlyCalendar = new StringBuilder();
            String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            String chosenMonth = months[month-1];
            monthlyCalendar.append(String.format("%16s %02d\n", chosenMonth, year));
            monthlyCalendar.append("Su Mo Tu We Th Fr Sa\n");
        
            for (int i = 1; i < getFirstWeekdayOfMonth(month); i++) {
                monthlyCalendar.append("   ");
            }
        
            for (int i = 1; i <= DateYMD.monthDays(month, year); i++) {
                if (i < 10) {
                    monthlyCalendar.append(" ");
                }
                monthlyCalendar.append(i);
                if (events[month-1][i-1] > 0){
                    monthlyCalendar.append("* ");
                }
                else{
                    monthlyCalendar.append(" ");
                }
                if ((i + getFirstWeekdayOfMonth(month) - 1) % 7 == 0 || i == DateYMD.monthDays(month, year)) {
                    monthlyCalendar.append("\n");
                }
            }
        
            return monthlyCalendar.toString();
        }
        
        public String toString() {
            StringBuilder yearlyCalendar = new StringBuilder();
            for (int i = 1; i <= 12; i++) {
                yearlyCalendar.append(printMonth(i));
                yearlyCalendar.append("\n");
            }
            return yearlyCalendar.toString();
        }
        
        
        

    }
