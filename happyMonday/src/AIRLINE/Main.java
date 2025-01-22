package AIRLINE;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to the Airline Management System!");

        // Aircraft Creation with Validation
        System.out.println("\nCreate a new Aircraft.");
        String modelNumber = getInput(scanner, "Enter model number: ");
        int capacity = getValidInt(scanner, "Enter capacity (positive number): ");
        double fuelConsumption = getValidDouble(scanner, "Enter fuel consumption (positive number): ");

        Aircraft aircraft = new PassengerAircraft(modelNumber, capacity, fuelConsumption);
        System.out.println("Aircraft created: " + aircraft);

        // Flight Creation with Validation
        System.out.println("\nCreate a new Flight.");
       String flightNumber = getInput(scanner, "Enter flight number: ");
        String departureTime = getInput(scanner, "Enter departure time: ");
        String destination = getInput(scanner, "Enter destination: ");

        Flight flight = new DomesticFlight(flightNumber, departureTime, destination);
        System.out.println("Flight created: " + flight);

        // Employee Creation with Validation
        System.out.println("\nAdd a new Employee.");
        int employeeID = getValidInt(scanner, "Enter employee ID (positive number): ");
        String name = getInput(scanner, "Enter employee name: ");
        double baseSalary = getValidDouble(scanner, "Enter base salary (positive number): ");

        AirlineEmployee employee = new Pilot(employeeID, name, baseSalary);
        System.out.println("Employee added: " + employee);
    }

    private static String getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    private static int getValidInt(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int value = Integer.parseInt(scanner.nextLine());
                if (value > 0) return value;
                System.out.println("Invalid input. Please enter a positive number.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    private static double getValidDouble(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                double value = Double.parseDouble(scanner.nextLine());
                if (value > 0) return value;
                System.out.println("Invalid input. Please enter a positive number.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}
