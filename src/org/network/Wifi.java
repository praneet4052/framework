package org.network;

public class Wifi {
	private void wifiName() {
		System.out.println("Rajamathangi");
	} public static void main(String[] args) {
		Wifi w=new Wifi();
		w.wifiName();
		Wireless f=new Wireless();
		f.modemName();
		MobileData m=new MobileData();
		m.dataName();
		Lan l=new Lan();
		l.lanName();
	}

}
