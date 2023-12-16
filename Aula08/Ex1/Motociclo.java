package Aula08.Ex1;

public class Motociclo extends Veiculo{
    
    //privates 
    private String tipo;

    //constructor
    public Motociclo(String matricula, String marca, String modelo, int potencia, String tipo) {
        super(matricula, marca, modelo, potencia);
        this.tipo = tipo;

    }

    //getters
    public String getTipo(){
        return tipo;
    }

    //setters
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    //toString
    public String toString() {
        return "Motociclo [" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + ", tipo=" + tipo + ']';
    }

}
