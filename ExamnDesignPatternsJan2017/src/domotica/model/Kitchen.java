package domotica.model;

import domotica.exceptions.Checks;
import domotica.exceptions.DomoticaException;
import domotica.exceptions.ElectricityException;
import domotica.exceptions.TemperatureException;

@SuppressWarnings("serial")
public class Kitchen extends Room {

	private boolean cooktopSwitchedOn;
	private boolean extractorHoodSwitchedOn;
	private int refrigeratorTemperature;
	private int freezerTemprature;

	Kitchen(String id) {
		super(id);
	}

	public boolean isCooktopSwitchedOn()		{	return cooktopSwitchedOn; }
	public boolean isExtractorHoodSwitchedOn()	{	return extractorHoodSwitchedOn;	}
	public int getRefrigeratorTemperature() 	{	return refrigeratorTemperature;	}
	public int getFreezerTemprature() 			{	return freezerTemprature; }
	
	public void setCooktopSwitchedOn(boolean cooktopSwitchedOn) {
		this.cooktopSwitchedOn = cooktopSwitchedOn;
	}

	public void setExtractorHoodSwitchedOn(boolean extractorHoodSwitchedOn) {
		this.extractorHoodSwitchedOn = extractorHoodSwitchedOn;
	}

	public void setRefrigeratorTemperature(int refrigeratorTemperature) throws ElectricityException, TemperatureException {
		Checks.checkTemperature(this, refrigeratorTemperature, 1, 15);
		Checks.checkElectricity(this);
		this.refrigeratorTemperature = refrigeratorTemperature;
	}

	public void setFreezerTemperature(int freezerTemprature) throws ElectricityException, TemperatureException {
		Checks.checkTemperature(this, freezerTemprature, -15, -1);
		Checks.checkElectricity(this);
		this.freezerTemprature = freezerTemprature;	
	}

	@Override
	public void reset() throws DomoticaException {
		super.reset();
		setCooktopSwitchedOn(false);
		setExtractorHoodSwitchedOn(false);
		setRefrigeratorTemperature(10);
		setFreezerTemperature(-5);
	}
}
