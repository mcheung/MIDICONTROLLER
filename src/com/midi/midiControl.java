package com.midi;

import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;

public class midiControl 
{
	MidiDevice.Info midiDev[];
	
	public midiControl()
	{
		midiDev = MidiSystem.getMidiDeviceInfo();
	}
	
	public void getMidiInfo()
	{
		//string desc;
		
		for (int md = 0; md < midiDev.length; md++)
		{
			System.out.println(midiDev[md].getDescription());
			System.out.println(midiDev[md].getName());
			
			System.out.println(midiDev[md].getVersion());
			System.out.println(midiDev[md].getVendor());
		}
		System.out.println("There are " + midiDev.length + " midi devices");
	}

}
