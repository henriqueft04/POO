package Aula06.Ex02;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaContactos {
    Scanner tec = new Scanner(System.in);
    //definir privates
    private ArrayList<Contacto> listaContactos;
    private ArrayList<Contacto> contactosRepetidos;
    
    //construtor
    public ListaContactos(){
        listaContactos = new ArrayList<Contacto>();
        contactosRepetidos = new ArrayList<Contacto>();
    }

    public void addContacto(Contacto contacto){
        boolean nomeExistente = false;
        boolean telefoneExistente = false;
        for (Contacto na : listaContactos){
            if (na.getcontacto().getName().equals(contacto.getcontacto().getName())){
                System.out.println("Esse nome ja existe registado");
                System.out.println("Deseja continuar a acrescentar novo contacto com o mesmo nome? (S/N)");
                String resposta = tec.nextLine();
                if(resposta.equals("S")){
                    listaContactos.add(contacto);
                    System.out.println("Contacto adicionado");
                }
                else{
                    System.out.println("Contacto não adicionado");
                }
                nomeExistente = true;
                break;
            }
        }
        if (!nomeExistente) {
            for (Contacto na : listaContactos){
                if (contacto.getTelefone() == na.getTelefone()){
                    System.out.println("Esse numero ja existe registado");
                    telefoneExistente = true;
                    break;
                }
            }
            if (!telefoneExistente) {
                listaContactos.add(contacto);
                System.out.println("Contacto adicionado");
            }
        }
    }
    

    public void removeContacto(String nome){
        contactosRepetidos = null;
        for(Contacto contacto : listaContactos){
            if(contacto.getcontacto().getName().contains(nome)){
                contactosRepetidos.add(contacto);
                if(contactosRepetidos.size()>1){
                    System.out.println("Existe mais de um contacto com o nome " + nome);
                    for(Contacto contactoRepetido : contactosRepetidos){
                        System.out.println(contactoRepetido);
                    }
                    System.out.print("Indique o ID do contacto a remover: ");
                    int id = tec.nextInt();
                    removeContacto(id);

                }
                else{
                    listaContactos.remove(contacto);
                    System.out.println("Contacto removido");
                }
            }
            else{
                System.out.println("Contacto não encontrado");}

        }

    }
    
    public void removeContacto(int telefone){
        contactosRepetidos = null;
        for(Contacto contacto : listaContactos){
            if(contacto.getTelefone() == telefone){
                listaContactos.remove(contacto);
                System.out.println("Contacto removido");
            }
            else{
                System.out.println("Contacto não encontrado");}


        }

    }

    public int getSize(){
        return listaContactos.size();
    }

    public void alterarContacto(String nomeAntigo, String novoNome, String novoEmail, int novoTelefone) {
        contactosRepetidos = null;
        for (Contacto contacto : listaContactos) {
            if (contacto.getcontacto().getName().contains(nomeAntigo)) {
                if (contactosRepetidos == null) {
                    contactosRepetidos = new ArrayList<>();
                    contactosRepetidos.add(contacto);
                    if (contactosRepetidos.size() > 1) {
                        System.out.println("Existe mais de um contacto com o nome " + nomeAntigo);
                        for (Contacto contactoRepetido : contactosRepetidos) {
                            System.out.println(contactoRepetido);
                        }
                        System.out.print("Indique o ID do contacto a alterar: ");
                        int id = tec.nextInt();
                        tec.nextLine(); // consume the newline character
                        alterarContacto(id, novoNome, novoEmail, novoTelefone);
                    } else {
                        Contacto contactoUnico = contactosRepetidos.get(0);
                        contactoUnico.getcontacto().setName(novoNome);
                        contactoUnico.setEmail(novoEmail);
                        contactoUnico.setTelefone(novoTelefone);
                        System.out.println("Contacto alterado");
                    }
                }
                contactosRepetidos.add(contacto);
            }
        }
        
        if (contactosRepetidos == null) {
            System.out.println("Contacto não encontrado");

        }
        
        
    }
    
    
    public void alterarContacto(int telefoneAntigo, String novoNome, String novoEmail, int novoTelefone) {
        contactosRepetidos = null;
        for (Contacto contacto : listaContactos) {
            if (contacto.getTelefone() == telefoneAntigo || contacto.getID() == telefoneAntigo) {
                if (contactosRepetidos == null) {
                    contactosRepetidos = new ArrayList<>();
                }
                contactosRepetidos.add(contacto);
            }
        }
        
        if (contactosRepetidos == null) {
            System.out.println("Contacto não encontrado");

        }
        
        if (contactosRepetidos.size() > 1) {
            System.out.println("Existe mais de um contacto com o numero " + telefoneAntigo);
            for (Contacto contactoRepetido : contactosRepetidos) {
                System.out.println(contactoRepetido);
            }
            System.out.print("Indique o ID do contacto a alterar: ");
            int id = tec.nextInt();
            tec.nextLine(); // consume the newline character
            alterarContacto(id, novoNome, novoEmail, novoTelefone);
        } else {
            Contacto contactoUnico = contactosRepetidos.get(0);
            contactoUnico.getcontacto().setName(novoNome);
            contactoUnico.setEmail(novoEmail);
            contactoUnico.setTelefone(novoTelefone);
            System.out.println("Contacto alterado");
        }
    }
    
    

    public void listarContactos(){
        for(Contacto contacto : listaContactos){
            System.out.println(contacto);
        }
    }

    public void procurarContactos(String nome){
        for(Contacto contacto : listaContactos){
            if(contacto.getcontacto().getName().contains(nome)){
                System.out.println(contacto);
            }
            else{
                System.out.println("Contacto nao encontrado");
            }
        }
    }

    public void procurarContactos(int numero){
        for(Contacto contacto : listaContactos){
            if(contacto.getTelefone() == numero ){
                System.out.println(contacto);
            }
            else{
                System.out.println("Contacto nao encontrado");
            }
        }
    }

}

