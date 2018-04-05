package by.htp.carparking.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import by.htp.carparking.dao.CarDao;
import by.htp.carparking.domain.Car;



public class CarDBDaoImpl extends DaoSqlRequestsPool implements CarDao{

	protected Connection con;
	
	@Override
	public void create(Car entity) {
	
	}

	@Override
	public Car read(int id) {
		
		return null;
	}

	@Override
	public void update(Car entity) {
		
	}

	@Override
	public void delete(int id) {
		
	}

	@Override
	public List<Car> readAll() {
		List<Car> carList = new ArrayList<>();
		try {
			con = wcn.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(SQL_GET_CARS);
			while (rs.next()) {
				Car currentCar = new Car(rs.getInt(CAR_ID));
				currentCar.setModel(rs.getString(CAR_MODEL));
				currentCar.setBrand(rs.getString(CAR_BRAND));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return carList;
	}
	
	
}
