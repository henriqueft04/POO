package Aula09.Ex03;
public class MilitaryPlane extends Plane {
    private int numMissiles;

    public MilitaryPlane(String id, String manufacturer, String model, int year, int maxPassengers, double maxSpeed, int numMissiles) {
        super(id, manufacturer, model, year, maxPassengers, maxSpeed);
        this.numMissiles = numMissiles;
    }

    public int getNumMissiles() {
        return numMissiles;
    }

    public void setNumMissiles(int numMissiles) {
        this.numMissiles = numMissiles;
    }

    public String getPlaneType() {
        return "Militar";
    }

    @Override
    public String toString() {
        return "MilitaryPlane{" + "id"+ getId() + "fabricante" + getFabricante() + "modelo" + getModelo() + "ano" + getAno() + "maxPassageiros" + getMaxPassageiros() + "maxSpeed" + getMaxSpeed() + "numMissiles=" + numMissiles + '}';
    }
}