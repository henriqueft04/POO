package Aula06.Ex02;

import Aula06.Ex1.Pessoa;
import java.util.regex.Pattern;

public class Contacto {
    
    //definir privates
    private int ID;
    private Pessoa contacto;
    private String email;
    private int telefone; 

    //construtor
    public Contacto(Pessoa contacto, String email, int telefone){
        if(email != null || telefone != 0){
            ID = NewID();
            counter++;
            this.contacto = contacto;
            if(email != null){
                if(validationEmail(email)){
                    this.email = email;
                }
                else{
                    System.out.println("Email invalido");
                    System.exit(1);
                }
            }
            if(telefone != 0){
                if(validationTelefone(telefone)){
                    this.telefone = telefone;
                }
                else{
                    System.out.println("Telefone invalido");
                    System.exit(1);
                }
            }
        }
        else{
            System.out.println("Tem de associar ao contacto um email ou um telefone");
        }
    }

    public int getID(){
        return this.ID;
    }

    public void setTelefone(int telefone) {
        if(validationTelefone(telefone)){
            this.telefone = telefone;
        }
        else{
            System.out.println("Telefone invalido");
            System.exit(1);
        }
    }

    static int counter = 0;

    static int NewID(){
        int ID = 1;
        return ID + counter;
    }


    public Pessoa getcontacto(){
        return this.contacto;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        if(validationEmail(email)){
            this.email = email;
        }
        else{
            System.out.println("Email invalido");
            System.exit(1);
        }
    }

    public int getTelefone(){
        return this.telefone;
    }

    public boolean validationEmail(String email){
        String regexEmail = "^[A-Za-z0-9+_.-]+@[a-z0-9]+\\.[a-z]{2,5}$";
        if (Pattern.matches( regexEmail ,email)){
            return true;
        }
        return false;
    }

    public boolean validationTelefone(int telefone){
        String numero = Integer.toString(telefone);
        String regexTelefone = "^9\\d{2}(?:[ -]?\\d{3})(?:[ -]?\\d{3})$";
        if (Pattern.matches( regexTelefone ,numero)){
            return true;
        }
        return false;
    }

    public String toString(){
        return ("ID: " + ID + "; Nome: "+ contacto.getName() + "; Email: " + email + "; Telefone: " + telefone);
    }



}
