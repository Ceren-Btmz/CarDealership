package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    public void display () {
        Scanner scanner = new Scanner(System.in);
        init();

        boolean running = true;
        while (running) {
            System.out.println("Welcome! Please select an option: ");
            System.out.println("1 - Find vehicles by price range");
            System.out.println("2 - Find vehicles by make / model");
            System.out.println("3 - Find vehicles by year");
            System.out.println("4 - Find vehicles by color");
            System.out.println("5 - Find vehicles by mileage");
            System.out.println("6 - Find vehicles by type ( car | truck | SUV | van");
            System.out.println("7 - List ALL vehicles");
            System.out.println("8 - Add a vehicle");
            System.out.println("9 - Remove a vehicle");
            System.out.println("x - Exit Platform");

            String input = scanner.nextLine().trim();
            switch (input) {
                case "1":
                    processGetByPriceRequest();
                case "2":
                    processGetByMakeModelRequest();
                case "3":
                    processGetByYearRequest();
                case "4":
                    processGetByColorRequest();
                case "5":
                    processGetByMileageRequest();
                case "6":
                    processGetByVehicleTypeRequest();
                case "7":
                    processGetAllVehicleRequest();
                case "8":
                    processAddVehicleRequest();
                case "9":
                    processRemoveVehicleRequest();
                case "x":
                    System.out.println();
                    running = false;
                default:
                    System.out.println("Error! Please select a valid option.");
                    break;
            }
        }
    }
    private void helperDisplayVehicles(List<Vehicle> listOfVehicles) {
        for (Vehicle vehicle : listOfVehicles) {
            System.out.println(vehicle);
        }
    }

    private void init() {
        DealershipFileManager fileManager = new DealershipFileManager();
        dealership = fileManager.getDealership();
    }

    public void processGetByPriceRequest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Minimum Price: ");
        double minPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Maximum Price: ");
        double maxPrice = scanner.nextDouble();
        scanner.nextLine();
        helperDisplayVehicles(dealership.getVehiclesByPrice(minPrice, maxPrice));
    }

    public void processGetByMakeModelRequest() {

    }

    public void processGetByYearRequest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Minimum year: ");
        int minYear = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Maximum year: ");
        int maxYear = scanner.nextInt();
        scanner.nextLine();
        helperDisplayVehicles(dealership.getVehiclesByYear(minYear, maxYear));
    }

    public void processGetByColorRequest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter color: ");
        String color = scanner.nextLine();
        helperDisplayVehicles(dealership.getVehiclesByColor(color));
    }

    public void processGetByMileageRequest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Minimum Mileage: ");
        double minMileage = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Maximum Mileage: ");
        double maxMileage = scanner.nextDouble();
        scanner.nextLine();
        helperDisplayVehicles(dealership.getVehiclesByMileage(minMileage, maxMileage));
    }

    public void processGetByVehicleTypeRequest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Vehicle type: ");
        String vehicleType = scanner.nextLine();
        helperDisplayVehicles(dealership.getVehiclesByType(vehicleType));
    }

    public void processGetAllVehicleRequest() {

    }

    public void processAddVehicleRequest() {

    }

    public void processRemoveVehicleRequest() {

    }

}
