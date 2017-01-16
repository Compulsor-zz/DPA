package domotica.exceptions;

import domotica.model.Room;

@SuppressWarnings("serial")
public class GasException extends DomoticaException {

	public GasException(Room room) {
		super(room, "Gas is still running.");
	}
	
}
