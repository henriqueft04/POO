package Aula09.Ex03;
import java.util.Scanner;

public class PlaneTester {
    public static void main(String[] args) {
        PlaneManager planeManager = new PlaneManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nPlane Fleet Menu:");
            System.out.println("1. Add a plane to the fleet");
            System.out.println("2. Remove a plane from the fleet");
            System.out.println("3. Search for a plane");
            System.out.println("4. Print summary of all planes in the fleet");
            System.out.println("5. Print list of all commercial planes in the fleet");
            System.out.println("6. Print list of all military planes in the fleet");
            System.out.println("7. Print the fastest plane in the fleet");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addPlane(planeManager, scanner);
                    break;
                case 2:
                    removePlane(planeManager, scanner);
                    break;
                case 3:
                    searchPlane(planeManager, scanner);
                    break;
                case 4:
                    printAllPlanes(planeManager);
                    break;
                case 5:
                    printCommercialPlanes(planeManager);
                    break;
                case 6:
                    printMilitaryPlanes(planeManager);
                    break;
                case 7:
                    printFastestPlane(planeManager);
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void addPlane(PlaneManager planeManager, Scanner scanner) {
        System.out.println("Enter the plane's id: ");
        String id = scanner.next();
        System.out.println("Enter the plane's manifacturer: ");
        String fabricante = scanner.next();
        System.out.println("Enter the plane's model: ");
        String model = scanner.next();
        System.out.println("Enter the plane's year: ");
        int ano = scanner.nextInt();
        System.out.println("Enter the plane's capacity: ");
        int capacidade = scanner.nextInt();
        System.out.println("Enter the plane's speed: ");
        double speed = scanner.nextInt();
        System.out.println("Enter the plane's type: ");
        System.out.println("1. Commercial");
        System.out.println("2. Military");
        int type = scanner.nextInt();

        
        if(type == 1){
            System.out.println("Enter the plane's number of crew members: ");
            int numCrew = scanner.nextInt();
            CommercialPlane planeComercial = new CommercialPlane(id, fabricante, model, ano, capacidade, speed, numCrew);
            planeManager.addPlane(planeComercial);
            System.out.println("Plane added");
        }
        else if(type == 2){
            System.out.println("Enter the plane's number of missiles: ");
            int numMissiles = scanner.nextInt();
            MilitaryPlane planeMilitar = new MilitaryPlane(id, fabricante, model, ano, capacidade, speed, numMissiles);
            planeManager.addPlane(planeMilitar);
            System.out.println("Plane added");
        }
        else{
            System.out.println("Invalid type");
        }
        

    }

    private static void removePlane(PlaneManager planeManager, Scanner scanner) {
        
        System.out.println("Enter the plane's id: ");
        String id = scanner.next();
        planeManager.removePlane(id);
        System.out.println("Plane removed");

    }

    private static void searchPlane(PlaneManager planeManager, Scanner scanner) {

        System.out.println("Enter the plane's id: ");
        String id = scanner.next();
        for(int i = 0; i < planeManager.getPlanes().size(); i++){
            if(planeManager.getPlanes().get(i).getId().equals(id)){
                System.out.println(planeManager.getPlanes().get(i).toString());
            }
        }
        
    }

    private static void printAllPlanes(PlaneManager planeManager) {
        planeManager.printAllPlanes();
    }

    private static void printCommercialPlanes(PlaneManager planeManager) {
        for(int i = 0; i < planeManager.getPlanes().size(); i++){
            if(planeManager.getPlanes().get(i).getPlaneType().equals("Commercial")){
                System.out.println(planeManager.getPlanes().get(i).toString());
            }
        }
    }

    private static void printMilitaryPlanes(PlaneManager planeManager) {
        for(int i = 0; i < planeManager.getPlanes().size(); i++){
            if(planeManager.getPlanes().get(i).getPlaneType().equals("Military")){
                System.out.println(planeManager.getPlanes().get(i).toString());
            }
        }
    }

    private static void printFastestPlane(PlaneManager planeManager) {
        System.out.println(planeManager.getFastestPlane());
    }
}
