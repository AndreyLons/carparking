package by.htp.carparking.controller.util;

import by.htp.carparking.controller.action.BaseAction;
import by.htp.carparking.action.impl.*;

import static by.htp.carparking.controller.util.CommandsPool.*;


public class ActionManager {
	
	private ActionManager() {
		
	}

	public static BaseAction serverAction(String action) {
		BaseAction act = null;
		switch(action) {
			case SHOW_CARS_LIST :
				act = new ShowCarsList();
				break;
			default : 
				act = new DefaultImpl();
		}
		 return act;
	}
}
