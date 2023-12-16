package Aula08.Ex1;

public class Taxi extends Veiculo{
    
    //privates
    private int numeroLicenca;
    private int quadro;

    //constructor
    public Taxi(String matricula, String marca, String modelo, int potencia, int quadro, int numeroLicenca) {
        super(matricula, marca, modelo, potencia);
        this.numeroLicenca = numeroLicenca;
        this.quadro = quadro;
    }

    //getters
    public int getNumeroLicenca(){
        return numeroLicenca;
    }

    public int getQuadro(){
        return quadro;
    }

    //setters
    public void setNumeroLicenca(int numeroLicenca){
        this.numeroLicenca = numeroLicenca;
    }

    public void setQuadro(int quadro){
        this.quadro = quadro;
    }

    //toString
    public String toString() {
        return "Taxi [" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + ", numero do quadro=" + quadro + ", numero da licenca=" + numeroLicenca + ']';
    }

}
