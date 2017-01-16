package domotica.facade;

import domotica.exceptions.DomoticaException;
import domotica.factory.ExceptionFactory;
import domotica.model.*;

public class TestPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		House home = new House("Home");
		DomoticaFacade domotica = new DomoticaFacade(home);
		ExceptionFactory ef = new ExceptionFactory();
		try {
			domotica.closeHouse();
//			domotica.openHouse();
		} catch (DomoticaException e) {
			e.printStackTrace();
		}
	}
}
