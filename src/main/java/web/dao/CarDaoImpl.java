package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    private List<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
        Car car1 = new Car();
        car1.setModel("bmw");
        car1.setNumber("x100xx");
        car1.setNumOfDoors(4);
        Car car2 = new Car();
        car2.setModel("mercedes");
        car2.setNumber("n123ll");
        car2.setNumOfDoors(2);
        Car car3 = new Car();
        car3.setModel("toyota");
        car3.setNumber("l099mk");
        car3.setNumOfDoors(2);
        Car car4 = new Car();
        car4.setModel("bmw");
        car4.setNumber("x100xx");
        car4.setNumOfDoors(4);
        Car car5 = new Car();
        car5.setModel("honda");
        car5.setNumber("u100lm");
        car5.setNumOfDoors(4);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        return cars;
    }
}
