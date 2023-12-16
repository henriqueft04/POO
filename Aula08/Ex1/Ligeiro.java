package Aula08.Ex1;

public class Ligeiro extends Veiculo{
    
    //privates
    private int quadro;
    private int bagageira;

    //constructor
    public Ligeiro(String matricula, String marca, String modelo, int potencia, int quadro, int bagageira) {
        super(matricula, marca, modelo, potencia);
        this.quadro = quadro;
        this.bagageira = bagageira;

    }

    //getters
    public int getQuadro(){
        return quadro;
    }

    public int getBagageira(){
        return bagageira;
    }

    //setters
    public void setQuadro(int quadro){
        this.quadro = quadro;
    }

    public void setBagageira(int bagageira){
        this.bagageira = bagageira;
    }

    //toString
    public String toString() {
        return "Veiculo Ligeiro [" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + ", numero do quadro=" + quadro + ", capacidade da bagageira=" + bagageira + "L ]";
    }


}
