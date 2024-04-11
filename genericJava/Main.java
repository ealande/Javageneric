package genericJava;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Toyota", "Corolla", 2020));
        carList.add(new Car("Honda", "Civic", 2019));
        carList.add(new Car("Ford", "Ka", 2021));

        for (Car car : carList) {
            System.out.println(car);
        }
    }
}