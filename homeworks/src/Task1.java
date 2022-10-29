import java.util.Scanner;
import java.lang.String;

public class Task1 {
    public static void main(String[] args) {
        StrategyGame victoria_3 = new StrategyGame();
        victoria_3.setName("Victoria 3");
        victoria_3.setStudio("paradox interactive");
        victoria_3.setEra("victorian");
        victoria_3.setMultiplayer(true);
        victoria_3.setYear("2022");
        victoria_3.result(100);

        StrategyGame hoi_4 = new StrategyGame();
        hoi_4.setName("Hearts of iron 4");
        hoi_4.setStudio("paradox interactive");
        hoi_4.setEra("ww2");
        hoi_4.setMultiplayer(true);
        hoi_4.setYear("2016");
        hoi_4.result(50);

        SimulatorGame car_mechanic = new SimulatorGame();
        car_mechanic.setName("Car Mechanic Simulator 2021");
        car_mechanic.setStudio("paradox interactive");
        car_mechanic.setProffesion("car mechanic");
        car_mechanic.setMultiplayer(false);
        car_mechanic.setYear("2021");
        car_mechanic.play();
    }
}