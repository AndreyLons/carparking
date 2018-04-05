package by.htp.carparking.dao.impl;

import by.htp.carparking.dao.util.DBConnection;

abstract class DaoSqlRequestsPool {

	public static final  String SQL_GET_CARS = "SELECT * FROM cars";
	
	
	public static final String CAR_ID = "id";
	public static final String CAR_MODEL = "model";
	public static final String CAR_BRAND = "brand";
	
	DBConnection wcn = new DBConnection();
}

