package com.midi;

import java.awt.BorderLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.midi.midiControl;

public class DataDisplay extends JFrame implements ActionListener
{	
	JButton btnGetMidi = new JButton("Get Midi Controllers");
	JPanel panel1 = new JPanel();
	
	public DataDisplay()
	{	
		panel1.setLayout(new BorderLayout());
		panel1.add(btnGetMidi, BorderLayout.NORTH);
		
		getContentPane().add(panel1, BorderLayout.CENTER);
		
		btnGetMidi.addActionListener(this);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
		DataDisplay display = new DataDisplay();
		display.setLocation(10, 10);
		display.setSize(300, 300);
		
		display.setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btnGetMidi)
		{
			midiControl midi = new midiControl();
			midi.getMidiInfo();
		}
	}
}
