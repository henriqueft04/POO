package Aula07.Ex1;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args){
        ArrayList<Object> memoria = new ArrayList<Object>();
        Scanner tec = new Scanner(System.in);
        int choice;
        do {System.out.println("Escolha uma opçao:");
        System.out.println("1. Adicionar círculo");
        System.out.println("2. Adicionar triângulo");
        System.out.println("3. Adicionar retângulo");
        System.out.println("4. Mostrar figuras criadas");
        System.out.println("5. Comparar figuras do mesmo tipo");
        System.out.println("6. Sair");
        choice = tec.nextInt();
        switch(choice) {
            case 1:
                System.out.print("Indique o raio do circulo: ");
                double raio = tec.nextDouble();
                while(raio <=0){
                    System.out.print("O raio do circulo tem de ser positivo: ");
                    raio = tec.nextDouble();
                }
                System.out.print("Indique a cor do circulo:");
                String cor = tec.next();
                Circle c1 = new Circle(raio, cor);
                memoria.add(c1);
                System.out.println("Circulo adicionado");
                break;
            
            case 2:
                System.out.print("Indique os lados do triangulo separados por espaços: ");
                tec.nextLine();
                String lados = tec.nextLine();
                String[] ladoAlado= lados.split(" ");
                String regex = "^[0-9]+(\\.[0-9]+)?$";
                if (ladoAlado.length != 3 || !ladoAlado[0].matches(regex) || !ladoAlado[1].matches(regex) || !ladoAlado[2].matches(regex)){                 
                    System.out.println("Tens de inserir 3 numeros positivos, nao me enganas");
                    break;
                }
                double lado1 = Double.parseDouble(ladoAlado[0]);
                double lado2 = Double.parseDouble(ladoAlado[1]);
                double lado3 = Double.parseDouble(ladoAlado[2]);
                System.out.print("Indique a cor do triangulo: ");
                String corTriangulo = tec.next();
                Triangle t1 = new Triangle(lado1, lado2, lado3, corTriangulo);
                memoria.add(t1);
                System.out.println("Triangulo adicionado");
                break;
            
            case 3:
                System.out.print("Indique o comprimento e a altura do retangulo (respetivamente), separados por espaços: ");
                tec.nextLine();
                String compriAlt = tec.nextLine();
                String[] para = compriAlt.split(" ");
                String regex1 = "^[0-9]+(\\.[0-9]+)?$";
                if (para.length != 2 || !para[0].matches(regex1) || !para[1].matches(regex1) ){                 
                    System.out.println("Tens de inserir 2 numeros positivos, nao me enganas");
                    break;
                }
                double comprimento = Double.parseDouble(para[0]);
                double altura = Double.parseDouble(para[1]);
                System.out.print("Indique a cor do retangulo: ");
                String corRetangulo = tec.next();
                Rectangle r1 = new Rectangle(comprimento, altura, corRetangulo);
                memoria.add(r1);
                System.out.println("Retangulo adicionado");
                break;
            
            case 4:
                System.out.println("FIgura criadas: ");
                for (int i = memoria.size()-1; i >=0  ; i -- ){
                System.out.println(memoria.get(i));
                }
                break;

            case 5:
                System.out.println("Que figuras quer comparar? ");
                System.out.println("1. Comparar círculo");
                System.out.println("2. Comparar triângulo");
                System.out.println("3. Comparar retângulo");
                int option = tec.nextInt();
                switch (option) {
                    case 1:
    
                        System.out.println("Selecione os circulos que quer comparar: ");
                        for (int i = 0; i < memoria.size() ; i ++) {
                            Object figurita = memoria.get(i);
                            if (figurita instanceof Circle) {
                                System.out.println("Circulo de indice " + i);}
                            }
                            System.out.print("Indice do primeiro circulo da comparacao: ");
                            int indice1 = tec.nextInt();
                                if (!(memoria.get(indice1) instanceof Circle)) {
                                    System.out.println("Isso nao é um circulo pa");
                                    return;
                                }
                            System.out.print("Indice do segundo circulo da comparacao: ");
                            int indice2 = tec.nextInt();
                                if (!(memoria.get(indice2) instanceof Circle)) {
                                    System.out.println("Isso nao é um circulo pa");
                                    return;
                                }
                                else if (memoria.get(indice2).equals(memoria.get(indice1))){
                                    System.out.println("Os circulos sao iguais");
                                }
                                else {
                                    System.out.println("Os circulos nao sao iguais");
                                }
                            break;
                    case 2:
                        System.out.println("Selecione os triangulos que quer comparar: ");
                        for (int i = 0; i < memoria.size() ; i ++) {
                            Object figurita = memoria.get(i);
                            if (figurita instanceof Triangle) {
                                System.out.println("Triangulo de indice " + i);}
                            }
                            System.out.print("Indice do primeiro triangulo da comparacao: ");
                            int triangle1 = tec.nextInt();
                                if (!(memoria.get(triangle1) instanceof Triangle)) {
                                    System.out.println("Isso nao é um triangulo pa");
                                    return;
                                }
                            System.out.print("Indice do segundo triangulo da comparacao: ");
                            int triangle2 = tec.nextInt();
                                if (!(memoria.get(triangle2) instanceof Triangle)) {
                                    System.out.println("Isso nao é um triangulo pa");
                                    return;
                                }
                                else if (memoria.get(triangle2).equals(memoria.get(triangle1))){
                                    System.out.println("Os triangulos sao iguais");
                                }
                                else {
                                    System.out.println("Os triangulos nao sao iguais");
                                }
                            break;
                    case 3:
                        System.out.println("Selecione os retangulos que quer comparar: ");
                        for (int i = 0; i < memoria.size() ; i ++) {
                            Object figurita = memoria.get(i);
                            if (figurita instanceof Rectangle) {
                                System.out.println("Retangulo de indice " + i);}
                            }
                            System.out.print("Indice do primeiro retangulo da comparacao: ");
                            int ret1 = tec.nextInt();
                                if (!(memoria.get(ret1) instanceof Rectangle)) {
                                    System.out.println("Isso nao é um retangulo pa");
                                    return;
                                }
                            System.out.print("Indice do segundo retangulo da comparacao: ");
                            int ret2 = tec.nextInt();
                                if (!(memoria.get(ret2) instanceof Rectangle)) {
                                    System.out.println("Isso nao é um retangulo pa");
                                    return;
                                }
                                else if (memoria.get(ret2).equals(memoria.get(ret1))){
                                    System.out.println("Os retangulos sao iguais");
                                }
                                else {
                                    System.out.println("Os retangulos nao sao iguais");
                                }
                            break;
                }

            }
        } while (choice != 6);
        tec.close();
    }
    
}
