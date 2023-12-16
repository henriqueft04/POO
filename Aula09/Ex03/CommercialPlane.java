package Aula09.Ex03;
public class CommercialPlane extends Plane {
    private int numOfCrewMembers;

    public CommercialPlane(String id, String manufacturer, String model, int year, int maxNumOfPassengers, double maxSpeed, int numOfCrewMembers) {
        super(id, manufacturer, model, year, maxNumOfPassengers, maxSpeed);
        this.numOfCrewMembers = numOfCrewMembers;
        
    }

    public int getNumOfCrewMembers() {
        return numOfCrewMembers;
    }

    public void setNumOfCrewMembers(int numOfCrewMembers) {
        this.numOfCrewMembers = numOfCrewMembers;
    }

    public String getPlaneType() {
        return "Commercial";
    }

    @Override
    public String toString() {
        return "CommercialPlane{" + "id: "+ getId() + " Fabricante: " + getFabricante() + " Modelo: " + getModelo() + " Ano: " + getAno() + " MaxPassageiros: " + getMaxPassageiros() + " MaxSpeed: " + getMaxSpeed() + " NumOfCrewMembers: " + numOfCrewMembers + '}';
    }
}
