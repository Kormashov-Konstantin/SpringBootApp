package ru.KataAcademy.SpringBootApp.service;



import ru.KataAcademy.SpringBootApp.model.Car;

import java.util.List;

public interface CarService {
    List <Car> getCountCar(Integer count);
}
