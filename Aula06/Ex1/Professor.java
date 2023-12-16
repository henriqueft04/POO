package Aula06.Ex1;
import Aula05.DateYMD;

import java.util.regex.Pattern;

public class Professor extends Pessoa {
    //definir privates
    private int NMec;
    private String categoria;
    private String departamento;
    
    //construtor
    public Professor(String nome, int CC, DateYMD dataNasc, String categoria, String departamento){
        super(nome, CC, dataNasc);
        NMec = NewNMec();
        counter++;

        if(validationCategoria(categoria)){
            this.categoria = categoria;

            if(validationDepartamento(departamento)){
                this.departamento = departamento;
            }
            else{
                System.out.println("Departamento invalido");
            }
        
        }

        else{
            System.out.println("Categoria invalida");
        }

    }    
    
    static int counter = 0;

    static int NewNMec(){
        int NMec = 100;
        return NMec + counter;
    }


    public String getCategoria(){
        return this.categoria;
    }

    public String getDepartamento(){
        return this.departamento;
    }

    public boolean validationCategoria (String categoria){
        if(categoria == "Auxiliar" || categoria == "Catedrático" || categoria == "Associado" || categoria == "Catedratico"){
            return true;
        }
        return false;
    }

    public boolean validationDepartamento(String departamento){
        String regexDepart = "\\w{2,20}";
        if(Pattern.matches(regexDepart, departamento)){
            return true;
        }
        return false;

    }

    public int getNMec(){
        return this.NMec;
    }

    public String getFuncao(){
        return "Professor";
    }

    public String toString(){
        return ("Professor: " + getName() + "; CC: " + getCC() + "; Data de Nascimento: " + getDataNasc() + "; NMec: " + NMec + "; Categoria: " + categoria + "; Departamento: " + departamento);
    }


}
