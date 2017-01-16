package domotica.exceptions;

import domotica.model.Room;

@SuppressWarnings("serial")
public class ElectricityException extends DomoticaException {

	public ElectricityException(Room room) {
		super(room, "Electricity is still on.");
	}
	
}
