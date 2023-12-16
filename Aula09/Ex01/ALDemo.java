package Aula09.Ex01;

import java.util.ArrayList; 
import java.util.Collections; 
import Aula06.Ex1.Pessoa;
import java.util.HashSet;
import java.util.Set;

import Aula05.DateYMD;
 
public class ALDemo { 
 
    public static void main(String[] args) { 
        ArrayList<Integer> c1 = new ArrayList<>(); 
        for (int i = 10; i <= 100; i+=10)  
            c1.add(i); 
        System.out.println("Size: " + c1.size()); 
        for (int i = 0; i < c1.size(); i++)  
            System.out.println("Elemento: " + c1.get(i)); 
        
        ArrayList<String> c2 = new ArrayList<>(); 
        c2.add("Vento"); 
        c2.add("Calor"); 
        c2.add("Frio"); 
        c2.add("Chuva"); 
        System.out.println(c2); 
        Collections.sort(c2); 
        System.out.println(c2); 
        c2.remove("Frio");  
        c2.remove(0); 
        System.out.println(c2); 
        if(c2.contains("Chuva")) 
            System.out.println("Chuva está na lista"); 
        else 
            System.out.println("Chuva não está na lista");
        System.out.println(c2.indexOf("Chuva"));
        c2.add("Ferro");
        c2.add("Chuva");
        System.out.println(c2.lastIndexOf("Chuva"));
        System.out.println(c2);
        c2.set(2, "Vento");
        System.out.println(c2);
        Set<Pessoa> c3 = new HashSet<>();
        Pessoa maria = new Pessoa("Maria", 12345678, new DateYMD(1,1,2000));
        Pessoa p1 = new Pessoa("Joao", 12345678, new DateYMD(1,1,2000));
        Pessoa p2 = new Pessoa("Pedro", 12845678, new DateYMD(1,1,2000));
        Pessoa p3 = new Pessoa("Ana", 87854321, new DateYMD(1,1,2000));
        Pessoa p4 = new Pessoa("Ze Tim", 12344678, new DateYMD(1,1,2000));

        c3.add(p1);
        c3.add(p2);
        c3.add(p3);
        c3.add(p4);
        c3.add(maria);
        c3.add(maria);

        for(Pessoa p : c3){
            System.out.println(p);
        }


    } 
}
