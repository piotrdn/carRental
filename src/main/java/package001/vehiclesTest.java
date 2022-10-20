package package001;

import org.junit.Test;

public class vehiclesTest {

    @Test
    public void firstTest(){
        vehicles vehicle = new vehicles();
        System.out.println("Samochód nr 1: " + vehicle.getTabVehicles(0));
        System.out.println("Samochód nr 2: " + vehicle.getTabVehicles(1));
        System.out.println("Samochód nr 3: " + vehicle.getTabVehicles(2));
        System.out.println("Samochód nr 3: " + vehicle.getTabVehicles(3));
        System.out.println("Samochów nr 4: " + vehicle.getTabVehicles(4));

        //ładniejsze drukowanie przez metodę
        //System.out.println("Better print:");
        //vehicle.TabPrinter(0);
        //vehicle.TabPrinter(1);
        //vehicle.TabPrinter(2);
        //vehicle.TabPrinter(3);
        //vehicle.TabPrinter(4);

    }

    @Test
    public void secondTest(){
        vehicles car = new vehicles();
        System.out.println("Printed by for loop:");
        for(int i=0;i<5;i++){
            car.TabPrinter(i);
        }
    }
    @Test
    public void thirdTest(){
        Localisation city = new Localisation();
        city.getCity(1);
        city.getCity(2);
        city.getCity(3);
        city.getCity(23);
    }


}
