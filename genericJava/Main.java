package genericJava;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        
        carList.add(new Car("Toyota", "Camry", 2020));
        carList.add(new Suv("Jeep", "Compass", 2019, true));
        carList.add(new Hatch("Honda", "City", 2020, 4));

        for (Car car : carList) {
            System.out.println(car);
        }
    }
}
