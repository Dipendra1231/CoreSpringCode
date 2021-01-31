package com.AndroidTech4u;

public class ServiceProvider {
	 
	//ServiceRemote r = new LgTv();
	//ServiceRemote r = new SamsungTv();
	
	ServiceRemote serviceremote;
	
	public ServiceRemote getServiceremote() {
		return serviceremote;
	}

	public void setServiceremote(ServiceRemote serviceremote) {
		this.serviceremote = serviceremote;
	}

	public String getRemoteService()
	{
		String c = serviceremote.ChannelChange();
		String co = serviceremote.ColorChange();
		String v = serviceremote.VolumeChange();
		return c+" "+co+" "+v;
	}
	

}
