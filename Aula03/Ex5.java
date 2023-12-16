package Aula03;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args){

        Scanner tec = new Scanner(System.in);
        System.out.print("Insira a data no formato mm/yyyy: ");
        String date = tec.nextLine();
        String[] mesAno = date.split("/");
        while (mesAno.length != 2){
            System.out.print("Erro no formato, insira a data no formato mm/yyyy: ");
            date = tec.nextLine();
            mesAno = date.split("/");
        }
        int mes = Integer.parseInt(mesAno[0]);
        int ano = Integer.parseInt(mesAno[1]);
        while (mes < 1 || mes > 12 || ano < 0) {
            if (ano < 0) {
                System.out.print("Ano tem de ser superior a 0, experimenta novamente: ");
                date = tec.nextLine();
                mesAno = date.split("/");
                mes = Integer.parseInt(mesAno[0]);
                ano = Integer.parseInt(mesAno[1]);
            }
            else if (mes < 1 || mes > 12 ) {
                System.out.print("Mes tem de estar entre 1 e 12, experimenta novamente: ");
                date = tec.nextLine();
                mesAno = date.split("/");
                mes = Integer.parseInt(mesAno[0]);
                ano = Integer.parseInt(mesAno[1]);
            }
        }
        int diaSemana ;
        do {
            System.out.println("Em que dia da semana começa o mes? ");
            System.out.println(" 1 = Segunda;" +  " 2 = Terça;" + " 3 = Quarta;" + " 4 = Quinta;" + " 5 = Sexta;" + " 6 = Sábado;" + " 7 = Domingo;");
            System.out.print("Inserir dia: ");
            diaSemana = tec.nextInt();
        } while ( 7 < diaSemana || diaSemana < 1);
        
        int diasMes;
        
        switch (mes) {
            case 2:
                if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
                    diasMes = 29;
                } else {
                    diasMes = 28;
                }
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasMes = 30;
                break;
            default:
                diasMes = 31;
                break;
        }

        String[] meses = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String mesEscolhido = meses[mes-1];
        System.out.printf("%16s %02d\n" , mesEscolhido , ano);
        System.out.println("Su Mo Tu We Th Fr Sa");
        for (int i = 1; i < diaSemana; i++) {
            System.out.print("   ");
        }
        for (int i = 1; i <= diasMes; i++) {
            if (i < 10) {
                System.out.print(" ");
            }
            System.out.print(i + " ");
            if ((i + diaSemana - 1) % 7 == 0 || i == diasMes) {
                System.out.println();
            }
        }
        tec.close();
    }
}