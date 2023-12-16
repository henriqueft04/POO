package Aula08.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Prato implements Comparable<Prato> {

    private String nome;
    private List<Alimento> listaAlimentos;
    private int contagemIngredientes;

    public Prato(String nome) {
        this.nome = nome;
        listaAlimentos = new ArrayList<>();
        contagemIngredientes = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Prato [nome=" + nome + ", composto por " + contagemIngredientes + " ingredientes " + "]";
    }

    public boolean adicionarIngrediente(Alimento alim) {
        listaAlimentos.add(alim);
        contagemIngredientes++;
        return true;
    }

    @Override
    public int compareTo(Prato p) {
        if (totalCalorias() < p.totalCalorias())
            return -1;
        else if (totalCalorias() > p.totalCalorias())
            return 1;
        return 0;
    }


    public String alimentosInfo() {
        String msg = "";

        for (Alimento alimento : listaAlimentos) {
        	msg = msg.concat( alimento.toString() );
		}
        return msg;
    }

    public void removeIngrediente(Alimento alimento) {
        listaAlimentos.remove(alimento);
        contagemIngredientes--;
    }


    public double totalPeso() {
        double p = 0;
        for (Alimento alimento : listaAlimentos) {
        	p = p +  alimento.getPeso();
		}
        return p;
    }


    public double totalCalorias() {
        Double parcial;
        double calorias = 0.0;
        
        for (Alimento alim : listaAlimentos) {
        	parcial = alim.getCalorias();
            calorias = calorias + parcial;
		}
        return calorias;
    }


    public double totalProteinas() {
    	double parcial = 0, proteinas = 0;
    	for (Alimento alim : listaAlimentos) {
        	parcial = alim.getCalorias();
            proteinas = proteinas + parcial;
		}
        return proteinas;
    }

}
