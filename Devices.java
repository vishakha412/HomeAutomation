package Com.firstbit;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Devices implements IControllable
{
	private String deviceName;
	private String devicetype;
	
	private boolean isdeviceTurnon;
	private Integer time;
	LocalTime startTime;
	LocalTime stopTime;
	private Integer getstartTime;
	public Devices()
	{
		
	}
	

	public Devices(String deviceName, String devicetype, boolean isdeviceTurnon, Integer time, LocalTime startTime,
			LocalTime stopTime) {
		super();
		this.deviceName = deviceName;
		this.devicetype = devicetype;
		this.isdeviceTurnon = isdeviceTurnon;
		this.time = time;
		this.startTime = startTime;
		this.stopTime = stopTime;
	}
	
	


	public Devices(String deviceName, String devicetype) {
		super();
		this.deviceName = deviceName;
		this.devicetype = devicetype;
	}

	
	

	public String getDeviceName() {
		return deviceName;
	}


	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}


	public String getDevicetype() {
		return devicetype;
	}


	public void setDevicetype(String devicetype) {
		this.devicetype = devicetype;
	}


	public boolean IsdeviceTurnon() {
		return isdeviceTurnon;
	}


	public void IsdeviceTurnon(boolean isdeviceTurnon) {
		this.isdeviceTurnon = isdeviceTurnon;
	}


	public Integer getTime() {
		return time;
	}


	public void setTime(Integer time) {
		this.time = time;
	}


	public LocalTime getStartTime() {
		return startTime;
	}


	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}


	public LocalTime getStopTime() {
		return stopTime;
	}


	public void setStopTime(LocalTime stopTime) {
		this.stopTime = stopTime;
	}


	@Override
	public void deviceTurnon()
	 {
		// TODO Auto-generated method stub
		this.isdeviceTurnon=true;
		this.startTime=LocalTime.now();
		
		
		
	}

	@Override
	public void deviceTurnoff() {
		// TODO Auto-generated method stub
		this.isdeviceTurnon=false;
		this.stopTime=LocalTime.now();
		
		
	}

	@Override
	public Integer countTime(Devices device) {
		// TODO Auto-generated method stub
		if(device.getStartTime()!=null) {
			device.setTime((int) device.getStopTime().until(device.getStartTime(), ChronoUnit.SECONDS));
		}
		
		  System.out.println("Device active time was "+device.getTime()+" second");
		  return device.getstartTime;
		
	}

}
