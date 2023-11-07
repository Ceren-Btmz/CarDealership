package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle>Inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.Inventory = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name ;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Dealership{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", Inventory=" + Inventory +
                '}';
    }

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max) {
        ArrayList<Vehicle> listOfVehiclesByPrice = new ArrayList<Vehicle>();
        for (Vehicle v : this.Inventory) {
            if (v.getPrice() >= min && v.getPrice() <= max) {
                listOfVehiclesByPrice.add(v);
            }
        }

        return listOfVehiclesByPrice;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel (String make, String model) {
        ArrayList<Vehicle> listOfVehiclesByMakeModel = new ArrayList<Vehicle>();
        for (Vehicle v : this.Inventory) {
            if (v.getMake().equalsIgnoreCase(make) || v.getModel().equalsIgnoreCase(model)) {
                listOfVehiclesByMakeModel.add(v);
            }
        }

        return listOfVehiclesByMakeModel;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int min, int max) {
        ArrayList<Vehicle> listOfVehiclesByYear = new ArrayList<Vehicle>();
        for (Vehicle v : this.Inventory) {
            if (v.getYear() >= min && v.getYear() <= max) {
                listOfVehiclesByYear.add(v);
            }
        }

        return listOfVehiclesByYear;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color) {
        ArrayList<Vehicle> listOfVehiclesByColor = new ArrayList<Vehicle>();
        for (Vehicle v : this.Inventory) {
            if (v.getColor().equalsIgnoreCase(color)) {
                listOfVehiclesByColor.add(v);
            }
        }
        return listOfVehiclesByColor;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(double min, double max) {
        ArrayList<Vehicle> listOfVehiclesByMileage = new ArrayList<Vehicle>();
        for (Vehicle v : this.Inventory) {
            if (v.getOdometer() >= min && v.getOdometer() <= max) {
                listOfVehiclesByMileage.add(v);
            }
        }

        return listOfVehiclesByMileage;
    }

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType) {
        ArrayList<Vehicle> listOfVehiclesByType = new ArrayList<Vehicle>();
        for (Vehicle v : this.Inventory) {
            if (v.getVehicleType().equalsIgnoreCase(vehicleType)) {
                listOfVehiclesByType.add(v);
            }
        }

        return listOfVehiclesByType;
    }

    public ArrayList<Vehicle> getAllVehicles() {
        return this.Inventory;
    }

    public void addVehicle(Vehicle vehicle) {
        this.Inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        this.Inventory.remove(vehicle);
    }
}
