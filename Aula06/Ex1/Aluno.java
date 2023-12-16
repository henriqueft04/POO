package Aula06.Ex1;
import java.time.LocalDate;
import Aula05.DateYMD;

import java.util.regex.Pattern;

public class Aluno extends Pessoa {
    //definir privates
    private int NMec;
    private DateYMD dataInsc;
    private LocalDate localDate = LocalDate.now();
    private int anoAtual = localDate.getYear();
    private int mesAtual = localDate.getMonthValue();
    private int diaAtual = localDate.getDayOfMonth();
    private DateYMD today = new DateYMD(diaAtual, mesAtual, anoAtual);
    

    //construtor
    public Aluno(String nome, int CC, DateYMD dataNasc, DateYMD dataInsc){
        super(nome, CC, dataNasc);
        NMec = NewNMec();
        counter++;

        if (validationNMec(NMec)){
            
            if (dataInsc != null){
                this.dataInsc = dataInsc;
            }
            else{
                this.dataInsc = today;
            }
        }
        else{
            System.out.println("Numero mecanografico invalido");
        }
    }    
    
    static int counter = 0;

    static int NewNMec(){
        int NMec = 100;
        return NMec + counter;
    }

    public int getNMec(){
        return this.NMec;
    }

    public DateYMD getDataInsc(){
        return this.dataInsc;
    }

    public boolean validationNMec(int NMec){
        String NMecString = Integer.toString(NMec);
        String regexNMec = "\\d{3,6}";
        if (Pattern.matches( regexNMec ,NMecString)){
            return true;
        }
        return false;
    }

    public String getFuncao(){
        return "Aluno";
    }

    public String toString(){
        return ("Nome: " + getName() + "; CC: " + getCC() + "; Data de Nascimento: " + getDataNasc() + "; NMec: " + NMec + "; Data de Inscricao: " + dataInsc);
    }


}
