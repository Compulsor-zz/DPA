package domotica.exceptions;

import domotica.model.Room;

@SuppressWarnings("serial")
public class TelevisionException extends DomoticaException {

	public TelevisionException(Room room) {
		super(room, "Television Exception");
	}
	public TelevisionException(Room room, String type, int curr, int lo, int hi) {
		super(room, "Television " + type + " (" + curr + ") is not between " + lo + " and " + hi + ".");
	}
}
