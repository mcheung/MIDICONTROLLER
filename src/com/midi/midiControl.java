package com.midi;

import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiSystem.*;

public class midiControl 
{
	public void main()
	{
		MidiDevice.Info midiDev[] = MidiSystem.getMidiDeviceInfo();
		
		for (int md = 0; md < midiDev.length; md++)
		{
			System.out.println(midiDev[md].getDescription());
			System.out.println(midiDev[md].getName());
			
			System.out.println(midiDev[md].getVersion());
			System.out.println(midiDev[md].getVendor());
		}
	}

}
