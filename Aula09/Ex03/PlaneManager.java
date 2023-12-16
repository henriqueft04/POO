package Aula09.Ex03;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
//import java.util.Map;

public class PlaneManager {

    //private
    private List <Plane> planes;

    //constructor
    public PlaneManager() {
        planes = new ArrayList<>();
    }

    public void addPlane(Plane plane) {
        planes.add(plane);
    }

    public void removePlane(String id) {
        for (Plane plane : planes) {
            if (plane.getId().equals(id)) {
                planes.remove(plane);
                break;
            }
        }
    }

    public Plane searchPlane(String Id){
        for (Plane plane : planes) {
            if (plane.getId().equals(Id)) {
                return plane;
            }
        }
        return null;

        
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public List<Plane> getCommercialPlanes(){
        List <Plane> commercialPlanes = new ArrayList<>();
        for(Plane commercial : planes){
            if(commercial.getPlaneType() == "Commercial"){
                commercialPlanes.add(commercial);
            }
        }
        return commercialPlanes;
    }

    public List<Plane> getMilitaryPlanes(){
        List <Plane> militaryPlanes = new ArrayList<>();
        for(Plane military : planes){
            if(military.getPlaneType() == "Military"){
                militaryPlanes.add(military);
            }
        }
        return militaryPlanes;
    }

    public void printAllPlanes(){
        for(Plane plane : planes){
            System.out.println(plane);
        }
    }


    public Plane getFastestPlane(){
        Plane fastestPlane = planes.get(0);
        for(Plane plane : planes){
            if(plane.getMaxSpeed() > fastestPlane.getMaxSpeed()){
                fastestPlane = plane;
            }
        }
        return fastestPlane;
    }

}
