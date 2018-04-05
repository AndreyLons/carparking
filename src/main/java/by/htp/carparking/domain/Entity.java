package by.htp.carparking.domain;

import java.io.Serializable;

public abstract class Entity implements Serializable {

	private static final long serialVersionUID = -3039059154041584079L;

	private int id;

	public Entity() {
		super();
	}

	public Entity(int id) {
		super();
		this.id = id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
