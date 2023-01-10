package web.dao;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService {
    private List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car(1, "Model1", 1));
        carList.add(new Car(2, "Model2", 2));
        carList.add(new Car(3, "Model3", 3));
        carList.add(new Car(4, "Model4", 4));
        carList.add(new Car(5, "Model5", 5));
    }

    @Override
    public List<Car> getCarsList(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
