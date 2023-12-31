package Aula08.Ex2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

public class Pedido {

    private Cliente cliente;

    private Collection<Prato> opcoes;
    private LocalDateTime hora;

    public Pedido(Cliente cliente, LocalDateTime hora) {
        this.cliente = cliente;
        this.hora = hora;
        opcoes = new ArrayList<Prato>();
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append(cliente);
        builder.append("\n");
        for (Prato prato : opcoes) {
            builder.append("\t prato: ");
            builder.append(prato);
            builder.append("\n");
        }
        builder.append("datahora=");
        builder.append(hora);
        builder.append("]");

        return builder.toString();
    }
    
    public double calcularCalorias() {
        double parcial, total = 0;
        for (Prato prato : opcoes) {
        	parcial = prato.totalCalorias();
            total = total + parcial;
        }
        return total;
    }

    public void setHora(java.time.LocalDateTime value) {
        this.hora = value;
    }


    public void adicionarPrato(Prato pratoEscolhido) {
        opcoes.add(pratoEscolhido);

    }

}
