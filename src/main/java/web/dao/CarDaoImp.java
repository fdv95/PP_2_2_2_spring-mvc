package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {
    private static int CARS_COUNT;
    private List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car(++CARS_COUNT, "Model1", 1));
        carList.add(new Car(++CARS_COUNT, "Model2", 2));
        carList.add(new Car(++CARS_COUNT, "Model3", 3));
        carList.add(new Car(++CARS_COUNT, "Model4", 4));
        carList.add(new Car(++CARS_COUNT, "Model5", 5));
    }

    @Override
    public List<Car> getCarsList(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
