package Aula06.Ex02;
import java.util.Scanner;

import Aula06.Ex1.Pessoa;

import Aula05.DateYMD;

public class Menu {
    
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        ListaContactos listaContactos = new ListaContactos();
        int opcao ;
        do{
            System.out.println("1 - Inserir contacto");
            System.out.println("2 - Alterar contacto");
            System.out.println("3 - Apagar contacto ");
            System.out.println("4 - Procurar contacto ");
            System.out.println("5 - Listar contactos");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            opcao = tec.nextInt();
            tec.nextLine();
            switch(opcao){
                case 1:
                    System.out.print("Nome da pessoa: ");
                    String nome = tec.nextLine();
                    System.out.print("CC da pessoa: ");
                    int cc = tec.nextInt();
                    System.out.print("Data de nascimento da pessoa(separamento por espaços dd mm aaaa): ");
                    DateYMD data = new DateYMD(tec.nextInt(), tec.nextInt(), tec.nextInt());
                    Pessoa pessoa = new Pessoa(nome, cc, data);
                    System.out.print("Email: ");
                    String email = tec.next();
                    System.out.print("Numero de telefone: ");
                    int telefone = tec.nextInt();
                    Contacto contacto = new Contacto(pessoa, email, telefone);
                    listaContactos.addContacto(contacto);

                    break;
                    case 2:
                        if (listaContactos.getSize() == 0) {
                            System.out.println("Não existem contactos guardados");
                            break;
                        }
                        System.out.println("Procurar contacto por: ");
                        System.out.println("1 - Nome");
                        System.out.println("2 - Telefone");
                        System.out.print("Opcao: ");
                        int choice = tec.nextInt();
                        tec.nextLine();
                        switch (choice) {
                            case 1:
                                System.out.print("Nome da pessoa: ");
                                String nomeProcurar = tec.nextLine();
                                listaContactos.procurarContactos(nomeProcurar);
                                System.out.print("Novo nome da pessoa: ");
                                String novoNome = tec.nextLine();
                                System.out.print("Novo telefone: ");
                                int novoTelefone = tec.nextInt();
                                System.out.print("Novo email: ");
                                String novoEmail = tec.next();
                                listaContactos.alterarContacto(nomeProcurar, novoNome, novoEmail, novoTelefone);
                                break;
                            case 2:
                                System.out.println("Telefone");
                                int telefoneProcurar = tec.nextInt();
                                listaContactos.procurarContactos(telefoneProcurar);
                                System.out.print("Novo nome: ");
                                String novoNome2 = tec.next();
                                System.out.println("Novo email");
                                tec.nextLine();
                                String novoEmail2 = tec.next();
                                System.out.print("Novo telefone: ");
                                int novoTelefone2 = tec.nextInt();
                                listaContactos.alterarContacto(telefoneProcurar, novoNome2, novoEmail2, novoTelefone2);
                                break;
                            default:
                                System.out.println("Opcao invalida");
                                break;
                        }
                        break;
                
                case 3:
                    if (listaContactos == null || listaContactos.getSize() == 0) {
                        System.out.println("Não existem contactos guardados");
                        break;
                    }
                    System.out.println("Insira o número ou nome do contacto para apagar");
                    String input = tec.next();
                    try {
                        int num = Integer.parseInt(input);
                        listaContactos.removeContacto(num);
                    } catch (NumberFormatException e) {
                        listaContactos.removeContacto(input);
                    }
                    System.out.println("Contacto removido com sucesso");
                    break;
                    
                case 4:
                    if(listaContactos.getSize() == 0){
                        System.out.println("Não existem contactos guardados");
                        break;
                    }
                    System.out.println("Insira contacto para procurar");
                    try {
                        int num = Integer.parseInt(tec.next());
                        listaContactos.procurarContactos(num);
                    } catch (NumberFormatException e) {
                        String str = tec.next();
                        listaContactos.procurarContactos(str);
                    }
                    break;
                
                case 5:
                    if(listaContactos.getSize() == 0){
                        System.out.println("Não existem contactos guardados");
                        break;
                    }
                    listaContactos.listarContactos();
                    break;
                    
                case 6:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }
        while(opcao != 0);
        tec.close();
        
    }
}
