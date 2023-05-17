import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;

    public UserInterface(Dealership dealership) {
        this.dealership = dealership;

    }

    public void display() {
        init();

    }


    private void init() {
        this.dealership = new Dealership(dealership.getName(), dealership.getAddress(), dealership.getPhone(), dealership.getInventory());

    }

    private void displayVehicles(ArrayList<Vehicle> inventory) {
       for(int i=0; i <inventory.size();i++) {
            System.out.println(inventory.get(i) + "");
        }

    }
}
