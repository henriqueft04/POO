package Aula04;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CarDemo {
    static Scanner sc = new Scanner(System.in);

    static boolean validacao(String Data) {
        String regex = "^(\\w+)\\s+(.+?)\\s+(\\d{4})\\s+(\\d+)$";
        return Pattern.matches(regex, Data.trim());
    }

    static int registerCars(Car[] cars) {
        int numCars = 0;
        while (true) {
            System.out.print("Insira dados do carro (marca modelo ano quilómetros): ");
            String data = sc.nextLine();
            if (data.isEmpty()) {
                break;
            }
            if (validacao(data) == false) {
                System.out.print("Dados mal formatados. Tente novamente.");
                continue;
            }
            String[] parts = data.trim().split("\\s+");
            String make = parts[0];
            String model = parts[1];
            int year = Integer.parseInt(parts[2]);
            int kms = Integer.parseInt(parts[3]);
            cars[numCars] = new Car(make, model, year, kms);
            numCars++;
        }
        return numCars;
    }

    static void registerTrips(Car[] cars, int numCars) {
        System.out.println("");
        while (true) {
            System.out.print("Registe uma viagem no formato \"carro:distância\": ");
            String input = sc.nextLine().trim();
            if (input.isEmpty()) {
                break;
            }
            String[] parts = input.split(":");
            if (parts.length != 2 || !parts[0].matches("\\d+") || !parts[1].matches("\\d+")) {
                System.out.println("Dados mal formatados. Tente novamente.");
                continue;
            }
            int index = Integer.parseInt(parts[0]);
            int distance = Integer.parseInt(parts[1]);
            if (index < 0 || index >= numCars) {
                System.out.println("Carro inválido. Tente novamente.");
                continue;
            }
            cars[index].drive(distance);
        }
    }

    static void listCars(Car[] cars, int numCars) {
        System.out.println("\nCarros registados:");
        for (int i = 0; i < numCars; i++) {
            System.out.printf("%s, %d, kms: %d\n", cars[i].make + " " + cars[i].model, cars[i].year, cars[i].kms);
        }
    }

    public static void main(String[] args) {
        Car[] cars = new Car[10];
        int numCars = registerCars(cars);
        if (numCars > 0) {
            listCars(cars, numCars);
            registerTrips(cars, numCars);
            listCars(cars, numCars);
        }
        sc.close();
    }

    static class Car {
        public String make;
        public String model;
        public int year;
        public int kms;

        public Car(String make, String model, int year, int kms) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.kms = kms;
        }

        public void drive(int distance) {
            kms += distance;
        }
    }
}
