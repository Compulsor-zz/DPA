package domotica.exceptions;

import domotica.model.Room;

@SuppressWarnings("serial")
public class TemperatureException extends DomoticaException {

	public TemperatureException(Room room) {
		super(room, "Temperature Exception");
	}
	public TemperatureException(Room room, int curr, int lo, int hi) {
		super(room, "Temperature (" + curr + ") is not between " + lo + " and " + hi + ".");
	}
}
