package domotica.exceptions;

import domotica.model.Room;

public class Checks {

	private Checks() {
		//	Prevents instantiation
	}
		
	public static void checkFlowLevel(Room room, float f, float lo, float hi) throws FlowLevelException {
		if (f < lo || hi < f) throw new FlowLevelException(room, f, lo, hi);
	}
	
	public static void checkTemperature(Room room, int i, int lo, int hi) throws TemperatureException {
		if (i < lo || hi < i) throw new TemperatureException(room, i, lo, hi);
	}
	
	public static void checkTvInt(Room room, String type, int i, int lo, int hi) throws TelevisionException {
		if (i < lo || hi < i) throw new TelevisionException(room, type, i, lo, hi);
	}

	public static void checkLightLevel(Room room, float f, int lo, int hi) throws LightLevelException {
		if (f < lo || hi < f) throw new LightLevelException(room, f, lo, hi);
	}
	
	//	Onderstaande checks simuleren dat er af en toe eens iets mis kan gaan
	public static void checkWater(Room room) throws WaterException {
		if (Math.random() < 0.1) throw new WaterException(room);
	}
	
	public static void checkElectricity(Room room) throws ElectricityException {
		if (Math.random() < 0.1) throw new ElectricityException(room);
	}
	
	public static void checkGas(Room room) throws GasException {
		if (Math.random() < 0.1) throw new GasException(room);
	}
	
}