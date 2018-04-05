package by.htp.carparking.service.impl;

import java.util.List;

import by.htp.carparking.dao.CarDao;
import by.htp.carparking.dao.impl.CarDBDaoImpl;
import by.htp.carparking.domain.Car;
import by.htp.carparking.service.CarService;

public class CarServiceImpl implements CarService{
	private CarDao carDao;
	
	public CarServiceImpl() {
		carDao = new CarDBDaoImpl();
	}
	
	@Override
	public void createCar(Car car) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCar(Car car) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCar(int carId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Car> getAllCars() {
		return carDao.readAll();
	}

}
