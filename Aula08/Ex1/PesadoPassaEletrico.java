package Aula08.Ex1;

public class PesadoPassaEletrico extends PesadoPassageiros implements VeiculoEletrico{
    
    //privates
    private int autonomia;

    //constructor
    public PesadoPassaEletrico(String matricula, String marca, String modelo, int potencia, int quadro, int lugares, int peso, int autonomia) {
        super(matricula, marca, modelo, potencia, quadro, lugares, peso);
        this.autonomia = autonomia;
    }

    public int autonomia(){
        return autonomia;
    }

    public void trajeto(int distancia){
        if(distancia > 0 && distancia <= autonomia){
            autonomia -= distancia;
        }
        else if(distancia > autonomia){
            System.out.println("O carro não acabou o caminho");
        }
        else if (distancia < 0){
            System.out.println("Distancia inválida");
        }
    }

    public void carregar(int percentagem){
        if(percentagem > 0 && percentagem <= 100){
            autonomia = (int) (autonomia * (percentagem/100.0));
            if(autonomia > 100){
                autonomia = 100;
            }
        }
        else if(percentagem > 100 || percentagem < 0){
            System.out.println("Percentagem inválida");
        }
    }

    //toString
    public String toString() {
        return "Veiculo Pesado Passageiros Eletrico [" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + ", numero do quadro=" + getQuadro() + ", numero de lugares=" + getMaximoPassageiros() + ", peso=" + getPeso() + "kg, autonomia=" + autonomia + "km ]";
    }
}
