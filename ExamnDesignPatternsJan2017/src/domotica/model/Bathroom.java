package domotica.model;

import domotica.exceptions.Checks;
import domotica.exceptions.DomoticaException;
import domotica.exceptions.FlowLevelException;
import domotica.exceptions.GasException;
import domotica.exceptions.TemperatureException;
import domotica.exceptions.WaterException;

@SuppressWarnings("serial")
public class Bathroom extends Room {

	private int showerTemperature;
	private float showerFlowLevel;
	private int tapTemperature;
	private float tapFlowLevel;

	Bathroom(String id) {
		super(id);
	}

	public int getShowerTemperature() 	{ return showerTemperature;	}
	public float getShowerFlowLevel() 	{ return showerFlowLevel; }
	public int getTapTemperature() 		{ return tapTemperature; }
	public float getTapFlowLevel() 		{ return tapFlowLevel;}

	public void setShowerTemperature(int showerTemperature) throws GasException, TemperatureException {
		Checks.checkTemperature(this, showerTemperature, 10, 60);
		Checks.checkGas(this);
		this.showerTemperature = showerTemperature;
	}

	public void setShowerFlowLevel(float showerFlowLevel) throws WaterException, FlowLevelException {
		Checks.checkFlowLevel(this, showerFlowLevel, 0, 1);
		Checks.checkWater(this);
		this.showerFlowLevel = showerFlowLevel;
	}

	public void setTapTemperature(int tapTemperature) throws GasException, TemperatureException {
		Checks.checkTemperature(this, tapTemperature, 10, 60);
		Checks.checkGas(this);
		this.tapTemperature = tapTemperature;
	}

	public void setTapFlowLevel(float tapFlowLevel) throws WaterException, FlowLevelException {
		Checks.checkFlowLevel(this, showerFlowLevel, 0, 1);
		Checks.checkWater(this);
		this.tapFlowLevel = tapFlowLevel;
	}

	@Override public void reset() throws DomoticaException {
		super.reset();
		setShowerTemperature(20);
		setShowerFlowLevel(0);
		setTapTemperature(20);
		setTapFlowLevel(0);
	}

}
