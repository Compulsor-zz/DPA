package domotica.model;

import domotica.exceptions.Checks;
import domotica.exceptions.DomoticaException;
import domotica.exceptions.ElectricityException;
import domotica.exceptions.TemperatureException;

@SuppressWarnings("serial")
public class Bedroom extends Room {

	private boolean alarmSwitchedOn;
	private int waterbedTemperature;

	Bedroom(String id) {
		super(id);
	}

	public boolean isAlarmSwitchedOn() 	{	return alarmSwitchedOn;	}
	public int getWaterbedTemperature() {	return waterbedTemperature;	}
	
	public void setAlarmSwitchedOn(boolean alarmSwitchedOn) throws ElectricityException {
		Checks.checkElectricity(this);
		this.alarmSwitchedOn = alarmSwitchedOn;
	}

	public void setWaterbedTemperature(int waterbedTemperature) throws ElectricityException, TemperatureException {
		Checks.checkTemperature(this, waterbedTemperature, 10, 30);
		Checks.checkElectricity(this);
		this.waterbedTemperature = waterbedTemperature;
	}

	@Override
	public void reset() throws DomoticaException {
		super.reset();
		setAlarmSwitchedOn(false);
		setWaterbedTemperature(20);
	}
}
