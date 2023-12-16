package Aula11.Ex4;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

public class Voo {

    public static void main(String[] args) throws FileNotFoundException{
        
        Scanner sc = new Scanner(new FileReader("src\\Aula11\\Ex4\\voos.txt"));
        Scanner sc2 = new Scanner(new FileReader("src\\Aula11\\Ex4\\companhias.txt"));
        HashMap<String, String> companhias = new HashMap<>();
        HashMap<String, List<Double>> atrasos = new HashMap<>();

        while(sc2.hasNextLine()){
            String sigla = "";
            String nome = "";
            String line = sc2.nextLine();
            String[] partes = line.split("\t");
            sigla = partes[0];
            for(int i = 1 ; i < partes.length; i++){
                nome += " " + partes[i];
            }
            companhias.put(sigla, nome);
           
        }

        try {
            FileWriter output = new FileWriter("Infopublico.txt");
            String inicial = "%-8s %-10s %-23s %-24s %-8s %-15s\n";
            output.write(String.format(inicial, "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs")); // Write the formatted string
            sc.nextLine();  
            while(sc.hasNextLine()){
                double atrasoTotal = 0;
                String line = sc.nextLine();
                String[] split = line.split("\t");
                String horas = split[0];
                String voo = split[1];
                String origem = split[2];
                String atraso = "";
                if(split.length == 4){
                    atraso = split[3];
                };
                String obs = "";
                String sigla = "";
                    if (voo.length() >= 2) {
                        sigla = voo.substring(0, 2);
                    }
                String nomeCompany = companhias.get(sigla);

                if(companhias.get(sigla) == null){
                    nomeCompany = " Companhia desconhecida";
                }
                if(atraso != ""){
                    String hora = horas.substring(0, 2);
                    String minuto = horas.substring(3);
                    String addHoras = atraso.substring(0, 2);
                    String addMinutos = atraso.substring(3);
                    int horaInt = Integer.parseInt(hora);
                    int minutoInt = Integer.parseInt(minuto);
                    int addHorasInt = Integer.parseInt(addHoras);
                    int addMinutosInt = Integer.parseInt(addMinutos);
                    int horaFinal = horaInt + addHorasInt;
                    int minutoFinal = minutoInt + addMinutosInt;
                    String horaFinalString = Integer.toString(horaFinal);
                    String minutoFinalString = Integer.toString(minutoFinal);
                    obs = horaFinalString + ":" + minutoFinalString;
                    atrasoTotal = addHorasInt * 60 + addMinutosInt;
                    if(atrasos.get(sigla) == null){
                        atrasos.put(sigla, new ArrayList<Double>());
                    }
                    atrasos.get(sigla).add(atrasoTotal);

                }
        
                output.write(String.format("%-8s %-9s %-24s %-24s %-8s %-15s\n", horas, voo, nomeCompany, origem, atraso, obs));
            }
  
            output.close();
            try (Scanner scanner = new Scanner(new File("Infopublico.txt"))) {
                while(scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
            }

        }catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        sc.close();
        sc2.close();

        System.out.println("Atraso medio por companhia: ");
        Voo voo = new Voo();
        voo.atrasoMedio(atrasos, companhias);
    }

    public void atrasoMedio(HashMap<String, List<Double>> atrasos, HashMap<String, String> compamhias) throws FileNotFoundException {
        
        Scanner scanner = new Scanner(new FileReader("src\\Aula11\\Ex4\\voos.txt"));
        
        try{
            FileWriter medio = new FileWriter("Atraso Medio.txt");
            String inicial2 = "%-23s %-8s\n";
            medio.write(String.format(inicial2, "Companhia", "Atraso Medio")); // Write the formatted string
            for(String key : atrasos.keySet()){
                double soma = 0;
                for(double atraso : atrasos.get(key)){
                    soma += atraso;
                }
                double media = Math.round(soma / atrasos.get(key).size());
                String nome = compamhias.get(key);
                medio.write(String.format("%-23s %-8s\n", nome, media)); // Write the formatted string
                
            }
            medio.close();
            try (Scanner scanner2 = new Scanner(new File("Atraso Médio.txt"))) {
                while(scanner2.hasNextLine()) {
                    System.out.println(scanner2.nextLine());
                }
            }
             
        }catch(Exception e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        for(String key : atrasos.keySet()){
            double soma = 0;
            for(double atraso : atrasos.get(key)){
                soma += atraso;
            }
            double media = Math.round(soma / atrasos.get(key).size());
            System.out.println(compamhias.get(key) + " - " + media);
            
        }

        scanner.close();

    }


}
