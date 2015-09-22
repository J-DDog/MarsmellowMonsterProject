package marshmallow.view;

import javax.swing.JOptionPane;

public class MarshmallowOutput
{
	public void displayMonsterConsole(String info)
	{
		System.out.println("My monster info is: " + info);
		
	}
	
	public void displayMonsterGUI(String info)
	{
		JOptionPane.showMessageDialog(null, "My monster info is: " + info);
		
	}
	
	public void displayMonsterHair(double monsterHair)
	{
		JOptionPane.showMessageDialog(null, "This Monsters has " + monsterHair + " Hairs on its head.");
		
	}
	
}
