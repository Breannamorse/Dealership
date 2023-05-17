import java.io.BufferedReader;
import java.io.*;

public class DealershipFileManager {
    private static final String file = "Dealership.csv";
    private static String[] parts;

    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            int lineNumber = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (lineNumber == 0) {
                    String name = parts[0];
                    String address = parts[1];
                    String phone = parts[2];
                    Dealership Dealership = new Dealership(name, address, phone);


                } else {
                    int vin = Integer.parseInt(parts[0]);
                    int year = Integer.parseInt(parts[1]);
                    String makes = parts[2];
                    String model = parts[3];
                    String vehicleType = parts[4];
                    String color = parts[5];
                    int odometer = Integer.parseInt(parts[6]);
                    double price = Double.parseDouble(parts[7]);
                    Vehicle vehicle = new Vehicle(vin, year, makes, model, vehicleType,
                            color, odometer, price);
                    Dealership.addVehicle(vehicle);

                }
                lineNumber++;
            }
            } catch(IOException e){
                throw new RuntimeException(e);
            }

        }
    }

