package by.htp.carparking.action.impl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import by.htp.carparking.service.CarService;
import by.htp.carparking.service.impl.CarServiceImpl;
import by.htp.carparking.controller.action.BaseAction;
import static by.htp.carparking.controller.util.CommandsPool.*;

import java.io.IOException;

public class ShowCarsList implements BaseAction{
	
	@Override
	public RequestDispatcher doAction(HttpServletRequest request) throws ServletException, IOException {
		CarService carService = new CarServiceImpl();
		request.setAttribute(CARS_LIST, carService.getAllCars());
		return request.getRequestDispatcher(CARS_LIST_PAGE);
	}

}
