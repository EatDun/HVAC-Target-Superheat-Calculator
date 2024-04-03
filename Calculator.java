import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Enter outdoor air temperature and indoor wet bulb temperature");
        
        double outdoorAirTemp = myObj.nextDouble();
        double indoorWetBulbTemp = myObj.nextDouble();
    
        double targetSuperheat = (indoorWetBulbTemp * 3 - 80 - outdoorAirTemp) / 2;
        
        if (targetSuperheat < 5){
            System.out.println("Superheat cannot be less than 5");
        }
        else {
        System.out.println("Target superheat is " + targetSuperheat);
        }
    }
}
