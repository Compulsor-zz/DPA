package domotica.exceptions;

import domotica.model.Room;

@SuppressWarnings("serial")
public class WaterException extends DomoticaException {

	public WaterException(Room room) {
		super(room, "Watertap is not closed.");
	}
	
}
