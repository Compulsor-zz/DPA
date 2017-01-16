package domotica.model;

import domotica.exceptions.Checks;
import domotica.exceptions.DomoticaException;
import domotica.exceptions.ElectricityException;
import domotica.exceptions.TelevisionException;

@SuppressWarnings("serial")
public class Living extends Room {

	private boolean tvSwitchedOn;
	private int tvChannel;
	private int tvVolume;

	Living(String id) {
		super(id);
	}

	public boolean isTvSwitchedOn()	{	return tvSwitchedOn; }
	public int getTvChannel() 		{	return tvChannel; }
	public int getTvVolume() 		{	return tvVolume; }
	
	public void setTvSwitchedOn(boolean tvSwitchedOn) {
		this.tvSwitchedOn = tvSwitchedOn;
	}
	
	public void setTvChannel(int tvChannel) throws ElectricityException, TelevisionException {
		Checks.checkTvInt(this, "channel", tvChannel, 0, 99);
		Checks.checkElectricity(this);
		this.tvChannel = tvChannel;
	}
	
	public void setTvVolume(int tvVolume) throws ElectricityException, TelevisionException {
		Checks.checkTvInt(this, "volume", tvVolume, 0, 10);
		Checks.checkElectricity(this);
		this.tvVolume = tvVolume;
	}

	@Override
	public void reset() throws DomoticaException {
		super.reset();
		setTvSwitchedOn(false);
		setTvChannel(1);
		setTvVolume(3);
	}
	
}
