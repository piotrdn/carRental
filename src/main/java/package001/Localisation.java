package package001;

public class Localisation {
    //public static void main(String[] args) {
        public void getCity(int cityID) {
            //int cityID = 4;
            switch (cityID) {
                case 1:
                    System.out.println("Gdańsk");
                    break;
                case 2:
                    System.out.println("Sopot");
                    break;
                case 3:
                    System.out.println("Warszawa");
                    break;
                default:
                    System.out.println("Online");
            }

        }




}
