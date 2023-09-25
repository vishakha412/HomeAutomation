package Com.firstbit;

import java.util.List;

public class Room {
	private String roomType;
	private List<Devices> devicesList;
	 
	public Room()
	{
		
	}

	public Room(String roomType, List<Devices> devicesList) {
		super();
		this.roomType = roomType;
		this.devicesList = devicesList;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public List<Devices> getDevicesList() {
		return devicesList;
	}

	public void setDevicesList(List<Devices> devicesList) {
		this.devicesList = devicesList;
	}
	
	//method According to problem Statement
	
	public void addRoomType(String RoomType,List<Devices> devices)
	{
		this.roomType = roomType;
	}
	public void addDevices(String DeviceName,String DeviceType)
	{
		devicesList.add(new Devices(DeviceName,DeviceType));
	}
	
	public void diaplayTime()
	{
		for(Devices device : devicesList)
		{
			System.out.println(device.getDeviceName()+ "::" + device.countTime(device));
		}
	}
		
		public void displayStatusForAllDevices1(Room room) {
		
			System.out.println(room.getRoomType() + "==>");
			for (Devices device: room.getDevicesList()) {
				System.out.println(device.getDeviceName()+" ::"+(device.IsdeviceTurnon()? "on":"off"));
				
				
				
			}
		}
		
		 public void displayStatusForSingleDevices(Room room,String deviceName) {
			
			System.out.println(room.getRoomType() + "==>");
			for (Devices device: room.getDevicesList()) {
				if(device.getDeviceName().equals(deviceName))
				System.out.println("for device "+device.getDeviceName()+ "status is: "
				+(device.IsdeviceTurnon()?"on":"off"));
		
		
		
	      }

        }
		  public void changeStatus(Room room,String deviceName)   {
			  System.out.println(" you wanted to change the status for device:"+deviceName);
			  boolean statusflag=false;
			  Devices device = new Devices();
			  
			  for(Devices d: room.getDevicesList())
			  {
				  if (d.getDeviceName().equals(deviceName)) {
					  device=d;
					  statusflag=true;
				  }
					  
				  }
			  if (statusflag)
			  {
				  if(device.IsdeviceTurnon())
				  {
					  System.out.println(""+device.getDeviceName()+"previous status was"
				       +(device.IsdeviceTurnon()? "on":"off"));
					  device.deviceTurnoff();
					  System.out.println(""+device.getDeviceName()+"current status is"
						       +(device.IsdeviceTurnon()? "on":"off"));
					  
				  }else {
					  
					  System.out.println(""+device.getDeviceName()+"previous status was"
						       +(device.IsdeviceTurnon()? "on":"off"));
							  device.deviceTurnon();
							  System.out.println(""+device.getDeviceName()+"current status is"
								       +(device.IsdeviceTurnon()? "on":"off"));
							  
					  
					  
				  
			  } 
			  }else {
				  
					  System.out.println("device not found");
				  }
			  }
			  
			  
			  
			  
			  
		  }
		     
		     
		     

