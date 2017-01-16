package domotica.exceptions;

import domotica.model.Room;

@SuppressWarnings("serial")
public class LightLevelException extends DomoticaException {

	public LightLevelException(Room room) {
		super(room, "Light Level Exception");
	}
	public LightLevelException(Room room, float curr, int lo, int hi) {
		super(room, "Light level (" + curr + ") is not between " + lo + " and " + hi + ".");
	}
}
