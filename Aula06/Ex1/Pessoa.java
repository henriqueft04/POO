package Aula06.Ex1;
import Aula05.DateYMD;
import java.util.regex.Pattern;
import java.lang.Integer;

public class Pessoa {

    //criar privates
    private String nome;
    private int CC;
    private DateYMD dataNasc;

    //construtor  
    public Pessoa(String nome, int CC, DateYMD dataNasc){
        if( validacaoNome(nome) && validacaoCC(CC) ){
            this.nome = nome;
            this.CC = CC;
            this.dataNasc = dataNasc;
        }
        else{
            if(!validacaoNome(nome)){
                System.out.println("Nome invalido");
            }
            if(!validacaoCC(CC)){
                System.out.println("CC invalido");
            }
            System.exit(1);
        }
        
    }

    public boolean validacaoNome(String nome){
        String regexNome = "^[A-Za-z]+(\\s[A-Za-z]+){0,4}$";
        if (Pattern.matches( regexNome ,nome)){
            return true;
        }
        return false;
    }

    public boolean validacaoCC(int CC){
        String CCstring =  Integer.toString(CC);
        String regexCC = "\\d{7,8}";

        if (Pattern.matches( regexCC ,CCstring)){
            return true;
        }
        return false;
    }

    public String getName(){
        return this.nome;
    }

    public void setName(String nome){
        if(validacaoNome(nome)){
            this.nome = nome;
        }
        else{
            System.out.println("Nome invalido");
            System.exit(1);
        }
    }

    public int getCC(){
        return this.CC;
    }

    public DateYMD getDataNasc(){
        return this.dataNasc;
    }

    public String toString(){
        return "Nome: " + this.nome + " CC: " + this.CC + " Data de Nascimento: " + this.dataNasc;
    }

}
