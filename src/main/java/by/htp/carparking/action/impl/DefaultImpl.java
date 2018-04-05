package by.htp.carparking.action.impl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import by.htp.carparking.controller.action.BaseAction;
import static by.htp.carparking.controller.util.CommandsPool.*;

import java.io.IOException;

public class DefaultImpl implements BaseAction{

	@Override
	public RequestDispatcher doAction(HttpServletRequest request)
			throws ServletException, IOException {
		return request.getRequestDispatcher(MAIN_PAGE);

	}
}
