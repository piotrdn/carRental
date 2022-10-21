package package001;
import java.util.Random;

public class vehicles {

    private String admin = "Piotr Danio";
    private int adminID = 1;  //4bajty
    private byte zm1 = 1; //1 bajt zakres od -128 do 127
    private short zm2 = 3; // 2 bajty akres od -32 768 do 32 767
    private float zm3 = 1.5f; //4 bajty max ok 6-7 liczb po przecinku
    private long zm4 = 123l; //8 bajtów zakres od -2^63 do (2^63)-1
    private double zm5 = 1234.123d; //8 bajtów - max ok 15 cyfr po przecinku
    private char a = 'a'; //2 bajty
    private boolean z_bool; //true lub false


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


    public int getRandom(int min, int max){  //metoda do liczb losowych
        Random random = new Random();
        return random.nextInt(max - min) +min;
    }

    public void setValue(int x, int y){
        System.out.println("Kwadrat liczby "+ x +" to: " + x*x);
        System.out.println("Iloczyn liczb " + x +" * "+ y + " = " + x*y);
        int roznica = x-y;
        System.out.println("Różnica liczb x - y = " + roznica);
        System.out.println("Reszta z dzielenia y/x = " + y%x);
        if(x%2 == 0)
            System.out.println("Liczba x jest parzysta.");
        else
            System.out.println("Liczba x jest nieparzysta");
        if(y%2 == 0)
            System.out.println("Liczba y jest parzysta.");
        else
            System.out.println("Liczba y jest nieparzysta");


    }








}
