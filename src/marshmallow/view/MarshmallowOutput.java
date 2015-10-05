package marshmallow.view;

import javax.swing.JOptionPane;

public class MarshmallowOutput
{
	public void displayMonsterConsole(String info)
	{
		System.out.println("My monster info is: " + info);
		
	}
	
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, "My monster info is: " + message);
		
	}
	
	public void displayMonsterHair(double monsterHair)
	{
		JOptionPane.showMessageDialog(null, "This Monsters has " + monsterHair + " Hairs on its head.");
		
	}
	
	public void displayAnyText(String text)
	{
		JOptionPane.showMessageDialog(null, text);
		
	}
	
	public String grabAnswer(String query)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, query);
		
		return answer;
	}
	
	public int grabAnswerInt(String query)
	{
		boolean x = true;
		int i = 0;
		while (x)
		{
			try 
			{
				i = Integer.parseInt(grabAnswer(query));
				x = false;
			}
			catch(NumberFormatException error)
			{
				displayMessage("Error Not a Integer - try again");
			}
				
		}
		return i;
		
	}
	
	public double grabAnswerDouble(String query)
	{
		boolean x = true;
		double i = 0;
		while (x)
		{
			try 
			{
				i = Double.parseDouble(grabAnswer(query));
				x = false;
			}
			catch(NumberFormatException error)
			{
				displayMessage("Error Not a Double - try again");
			}
				
		}
		return i;
		
	}
	
}
