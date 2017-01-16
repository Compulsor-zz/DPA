package domotica.exceptions;

import domotica.model.Room;

@SuppressWarnings("serial")
public class FlowLevelException extends DomoticaException {

	public FlowLevelException(Room room) {
		super(room, "Flow Level Exception");
	}
	public FlowLevelException(Room room, float curr, float lo, float hi) {
		super(room, "Flow level (" + curr + ") is not between " + lo + " and " + hi + ".");
	}
}
