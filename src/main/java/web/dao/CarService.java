package web.dao;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCarsList(int count);
}
