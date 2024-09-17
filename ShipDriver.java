package com.company;

public class ShipDriver {
    public static void main(String[] args) {
        // Create an array of Ship objects
        Ship[] ships = new Ship[3];

        // Initialize the array with one type each of Ship, CruiseShip, and CargoShip
        ships[0] = new Ship("Generic Ship", "1990");
        ships[1] = new CruiseShip("Cruise Liner", "2005", 3000);
        ships[2] = new CargoShip("Cargo Vessel", "2010", 50000);

        // Loop through the array and call each print function
        for (Ship ship : ships) {
            ship.print();
            System.out.println();
        }
    }
}

