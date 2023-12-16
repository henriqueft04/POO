package Aula08.Ex1;

public abstract class Veiculo implements KmPercorridosInterface{

    //privates
    protected int quilometros;
    protected int ultimoTrajeto;
    protected String matricula;
    protected String marca;
    protected String modelo;
    protected int potencia;

    //constructor
    public Veiculo(String matricula, String marca, String modelo, int potencia) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.quilometros = 0;
        this.ultimoTrajeto = 0;
    }

    public void trajeto(int quilometros) {
        this.quilometros += quilometros;
        this.ultimoTrajeto = quilometros;
    }

    public int ultimoTrajeto() {
        return ultimoTrajeto;
    }

    public int distanciaTotal() {
        return quilometros;
    }

    public void validarMatricula(String matricula) {
        String matriculaRegex1 = "^[A-Z]{2}-[0-9]{2}-[A-Z]{2}$";
        String matriculaRegex2 = "^[0-9]{2}-[A-Z]{2}-[0-9]{2}$";
        if(matricula.matches(matriculaRegex1) || matricula.matches(matriculaRegex2)){
            System.out.println("Matricula válida");
        }
        else{
            System.out.println("Matricula inválida");
        }
    }

    //getters
    public String getMatricula(){
        return matricula;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getPotencia(){
        return potencia;
    }

    //setters
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
    
}
