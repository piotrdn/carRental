package package001;

public class vehicles {

    private String admin = "Piotr Danio";
    private int adminID = 1;

    public String getTabVehicles(int i){
        String vehiclesTab[] = new String[5];
        vehiclesTab[0] = "Toyota Supra";
        vehiclesTab[1] = "BMW e36";
        vehiclesTab[2] = "Mercedes W124";
        vehiclesTab[3] = "Audi SQ7";
        vehiclesTab[4] = "Lamborghini Huracan";
        return vehiclesTab[i];
    }

    public void TabPrinter(int i){
        System.out.println("Car nr [" + i + "] " + "is: " + getTabVehicles(i));
    }







}