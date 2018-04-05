package by.htp.carparking.dao;

import java.util.List;

import by.htp.carparking.domain.Entity;

public interface BaseDao<T extends Entity> {

	void create(T entity);
	T read(int id);
	List<T> readAll();
	void update(T entity);
	void delete(int id);

}
