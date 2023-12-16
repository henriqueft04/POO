package Aula08.Ex1;

public class PesadoMercadorias extends Veiculo{
    
    //privates
    private int cargaMaxima;
    private int peso;
    private int quadro;

    //constructor
    public PesadoMercadorias(String matricula, String marca, String modelo, int potencia, int cargaMaxima, int peso, int quadro) {
        super(matricula, marca, modelo, potencia);
        this.cargaMaxima = cargaMaxima;
        this.peso = peso;
        this.quadro = quadro;
    }

    //getters
    public int getCargaMaxima(){
        return cargaMaxima;
    }

    public int getPeso(){
        return peso;
    }

    public int getQuadro(){
        return quadro;
    }

    //setters
    public void setCargaMaxima(int cargaMaxima){
        this.cargaMaxima = cargaMaxima;
    }

    public void setPeso(int peso){
        this.peso = peso;
    }

    public void setQuadro(int quadro){
        this.quadro = quadro;
    }

    //toString
    public String toString() {
        return "Pesado de Mercadorias [" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + ", carga maxima=" + cargaMaxima + "kg, peso=" + peso + "kg, numero do quadro=" + quadro + ']';
    }
}
