package Aula06.Ex1;
import Aula05.DateYMD;

public class Bolseiro extends Aluno{

    //definir privates
    private int valorBolsa;
    private Professor orientador;

    public Bolseiro(String nome, int CC, DateYMD dataNasc, Professor orientador,  int valorBolsa) {
        super(nome, CC, dataNasc, null);
        
        if(validationValorBolsa(valorBolsa)){
            this.valorBolsa = valorBolsa;
            this.orientador = orientador;}
        else{
            System.out.println("Valor da bolsa invalido");
        }

    }

    public int getBolsa(){
        return this.valorBolsa;
    }

    public int setBolsa(int valorBolsa){
        if(validationValorBolsa(valorBolsa)){
            this.valorBolsa = valorBolsa;
            return valorBolsa;
        }
        else{
            System.out.println("Valor da bolsa invalido");
            return 0;
        }
    }

    public Professor getOrientador(){
        return this.orientador;
    }

    public Boolean validationValorBolsa(int valorBolsa){
        if (valorBolsa > 0){
            return true;
        }
        return false;
    }

    public String toString(){
        return ("Bolseiro: " + getName() + "; CC: " + getCC() + "; Data de Nascimento: " + getDataNasc() + "; NMec: " + getNMec() + "; Data de Inscricao: " + getDataInsc() + "; Valor da Bolsa: " + valorBolsa + "; Orientador: " + orientador);
    }
    
}
