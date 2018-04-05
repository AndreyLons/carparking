package by.htp.carparking.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

public interface BaseAction {
	RequestDispatcher doAction(HttpServletRequest request) throws ServletException, IOException;
}
