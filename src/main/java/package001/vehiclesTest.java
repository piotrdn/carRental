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
    //@Test
    /*public void fourthTest(){
        vehicles carCount = new vehicles();
        while(carCount.getTabVehicles(int i) < 3){
            System.out.println(carCount.getTabVehicles(i));
            i++;
        }
    }
*/
    @Test
    public void fifthTest(){
        vehicles randomNo = new vehicles();
        int temp = randomNo.getRandom(-3,3);
        System.out.println("Wygenerowana liczba to: " + temp);

        if(temp > 0){
            System.out.println("Wylosowana liczba jest dodatnia.");
        }
        else if(temp < 0){
            System.out.println("Wylosowana liczba jest ujemna.");
        }
        else System.out.println("Liczba jest równa 0.");

    }


    @Test
    public void graLosujaca(){
        vehicles los = new vehicles();
        int counter = 0;
        int target;

        do {
            target = los.getRandom(-6,6);
            System.out.println("Wylosowana liczba to: " + target);
            counter = counter + 1;
            //System.out.println("Ilosć losowań: " + counter);
        }
        while(target != 2); //dopóki fałsz
        System.out.println("Ilosć losowań ------------> " + counter + " <---");

    }


    @Test
    public void rysowanie(){
        int n = 20;
        //int m = 10;


        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++)
                System.out.print("#");
            System.out.println();

        }
        //System.out.println();

        for(int i=0;i<(n/3);i++){
            System.out.print("#");
            for(int j=0;j<(n/3);j++)
                System.out.print("#");
            System.out.println();

        }
    }



}

