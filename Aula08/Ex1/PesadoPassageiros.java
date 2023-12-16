package Aula08.Ex1;

public class PesadoPassageiros extends Veiculo{
    
    //privates
    private int quadro;
    private int maximoPassageiros;
    private int peso;

    //constructor
    public PesadoPassageiros(String matricula, String marca, String modelo, int potencia, int quadro, int maximoPassageiros, int peso) {
        super(matricula, marca, modelo, potencia);
        this.quadro = quadro;
        this.maximoPassageiros = maximoPassageiros;
        this.peso = peso;
    }

    //getters
    public int getQuadro(){
        return quadro;
    }

    public int getMaximoPassageiros(){
        return maximoPassageiros;
    }

    public int getPeso(){
        return peso;
    }

    public int getNumeroPassageiros(){
        return maximoPassageiros;
    }

    //setters
    public void setQuadro(int quadro){
        this.quadro = quadro;
    }

    public void setMaximoPassageiros(int maximoPassageiros){
        this.maximoPassageiros = maximoPassageiros;
    }

    public void setPeso(int peso){
        this.peso = peso;
    }

    //toString
    public String toString() {
        return "Pesado de Passageiros [" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + ", numero do quadro=" + quadro + ", maximo de passageiros=" + maximoPassageiros + ", peso=" + peso + "kg]";
    }
}
