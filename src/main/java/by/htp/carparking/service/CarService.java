package by.htp.carparking.service;

import java.util.List;

import by.htp.carparking.domain.Car;

public interface CarService {
	void createCar(Car car);
	void updateCar(Car car);
	void deleteCar(int carId);
	List<Car> getAllCars();
}
