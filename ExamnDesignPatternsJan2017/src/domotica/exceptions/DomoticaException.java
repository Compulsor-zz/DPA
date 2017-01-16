package domotica.exceptions;

import java.io.PrintStream;

import domotica.model.Room;

@SuppressWarnings("serial")
public abstract class DomoticaException extends Exception {
	
	protected Room room;

	DomoticaException(Room room) {
		this(room, null);
	}
	DomoticaException(Room room, String message) {
		super(message);
		this.room = room;
	}
	
	@Override
	public void printStackTrace(PrintStream s) {
		s.print("Room: " + room.getClass().getSimpleName() + "\n");
		super.printStackTrace(s);
	}
	
}
