package Aula09.Ex03;
public abstract class Plane {

    //privates
    private String id;
    private String fabricante;
    private String modelo;
    private int ano;
    private int maxPassageiros;
    private double maxSpeed;

    //constructor
    public Plane(String id, String fabricante, String modelo, int ano, int maxPassageiros, double maxSpeed) {
        this.id = id;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.maxPassageiros = maxPassageiros;
        this.maxSpeed = maxSpeed;

        
    }

    public abstract String getPlaneType();

    //getters
    public String getId() {
        return id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getMaxPassageiros() {
        return maxPassageiros;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    //setters
    public void setId(String id) {
        this.id = id;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMaxPassageiros(int maxPassageiros) {
        this.maxPassageiros = maxPassageiros;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    //toString
    public String toString() {
        return "Plane{" + "id=" + id + ", fabricante=" + fabricante + ", modelo=" + modelo + ", ano=" + ano + ", maxPassageiros=" + maxPassageiros + ", maxSpeed=" + maxSpeed + '}';
    }


}
